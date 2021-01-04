package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateUserInfo {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			Connection con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521/xe", "jtest","ezen1234");
			Statement stmt = con.createStatement();
			
			String sql = "update user_info";
			sql += " set ui_name = '하길동',";
			sql += " ui_id = 'ha',";
			sql += " ui_pwd = 'ha'";
			sql += "where ui_num = 3";
			
			int result = stmt.executeUpdate(sql);
			System.out.println(result + "개 update되었음");
			con.commit();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}				
	}
}
