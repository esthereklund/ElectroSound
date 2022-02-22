package model.interfaces;

import java.sql.ResultSet;

public interface DBConnection {
	ResultSet getDataFromDatabase() throws Exception;
	ResultSet getArticlesWithPics() throws Exception;
	void addImage(String encodedImage, int artikelId) throws Exception;
}
