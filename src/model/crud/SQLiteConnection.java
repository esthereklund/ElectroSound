package model.crud;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.interfaces.DBConnection;

public class SQLiteConnection implements DBConnection{
	private static final String URL = "jdbc:sqlite:./DB/Electrosound.db";
	private Connection connection;
	public SQLiteConnection() {
		try {
			this.setConnection(DriverManager.getConnection(URL));
			System.out.println("Verbindung erfolgreich");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public ResultSet getDataFromDatabase() throws Exception {
		Statement stm = this.getConnection().createStatement();
		String sql = "SELECT * FROM cd";
		ResultSet res = stm.executeQuery(sql);
		return res;
	
	}

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
