package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectUserInfo {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			Connection con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521/xe", "jtest", "ezen1234");
			String sql = "select * from user_info";
			Statement stmt = con.createStatement();
		    ResultSet rs = stmt.executeQuery(sql); //메소드에 호출
			while(rs.next()) {
				System.out.print(rs.getString("ui_num") + ",");
				System.out.print(rs.getString("ui_name") + ",");
				System.out.print(rs.getString("ui_id") + ",");
				System.out.println(rs.getString("ui_pwd"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
				
	}
}
