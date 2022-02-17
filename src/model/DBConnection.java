package model;

import java.sql.ResultSet;

public interface DBConnection {
	ResultSet getDataFromDatabase() throws Exception;
}
