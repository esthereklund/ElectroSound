package model;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import model.crud.SQLiteConnection;

public class MainModel {
	private DBConnection dbConnection;
	private List<Cd> cdList;
	
	public MainModel() {
		this.setDbConnection(new SQLiteConnection());
		this.setCdList(new ArrayList<>());
	}
	
	public List<Cd> getDataFromDB() throws Exception {
		this.getCdList().clear();
		try {
			ResultSet res = this.getDbConnection().getDataFromDatabase();
			while(res.next()) {
				this.getCdList().add(new Cd(res.getInt(1), res.getString(2), res.getDouble(3), res.getString(4)));
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return this.getCdList();
	}

	public DBConnection getDbConnection() {
		return dbConnection;
	}

	public void setDbConnection(DBConnection dbConnection) {
		this.dbConnection = dbConnection;
	}

	public List<Cd> getCdList() {
		return cdList;
	}

	public void setCdList(List<Cd> cdList) {
		this.cdList = cdList;
	}
	
	


	
	
	
}
