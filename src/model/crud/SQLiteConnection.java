package model.crud;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.interfaces.DBConnection;

public class SQLiteConnection implements DBConnection{
	private static final String URL = "jdbc:sqlite:./DB/Electrosound.db";
	private Connection connection;
	
	//Konstruktor
	public SQLiteConnection() {
		try {
			this.setConnection(DriverManager.getConnection(URL));
			System.out.println("Verbindung erfolgreich");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	//Daten über Artikeln vom DatenBank holen
	@Override
	public ResultSet getDataFromDatabase() throws Exception {
		Statement stm = this.getConnection().createStatement();
		String sql = "SELECT * FROM cd ORDER BY cd_id";
		ResultSet res = stm.executeQuery(sql);
		return res;
	
	}
	
	//Bilder in Datenbank hinzufügen
	@Override
	public void addImage(String encodedImage, int artikelId) throws Exception {
		String sql = "INSERT INTO bild (bild_id, bild) VALUES (?, ?)";
		
		PreparedStatement ps = this.getConnection().prepareStatement(sql);
		ps.setInt(1, artikelId);
		ps.setString(2, encodedImage);
		ps.execute();
	}
	
	@Override
	public ResultSet getArticlesWithPics() throws Exception {
		Statement stm = this.getConnection().createStatement();
		String sql = "SELECT * FROM cd, bild WHERE cd.cd_id = bild.bild_id ORDER BY titel";
		ResultSet res = stm.executeQuery(sql);
		return res;
	}

	
	//GETTER, SETTER
	public Connection getConnection() {
		return connection;
	}

	public void setConnection(Connection connection) {
		this.connection = connection;
	}

	public static String getUrl() {
		return URL;
	}



	
}
