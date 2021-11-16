package examples;

import java.sql.Connection;

import db.DB;

public class App1Connect {

	public static void main(String[] args) {
		
		Connection conn = DB.getConnection();
		DB.closeConnection();

	}

}
