package model.crud;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.DBConnection;

public class SQLiteConnection implements DBConnection{
	private static final String URL = "jdbc:sqlite:./DB/Electrosound.db";
	private Connection connection;
	public SQLiteConnection() {
		try {
			this.setConnection(DriverManager.getConnection(URL));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public ResultSet getDataFromDatabase() {
		try(Statement stm = this.getConnection().createStatement()){
			String sql = "SELECT * FROM artikel";
			ResultSet res = stm.executeQuery(sql);
			return res;
		}catch(Exception e) {
			
		}
		return null;
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
