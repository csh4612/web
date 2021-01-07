package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectSongInfo {
	public static void main(String[] args) {
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			Connection con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521/xe", "jtest","ezen1234");
			
			String sql = "select * from song_info";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				System.out.print(rs.getString("si_num") + ",");
				System.out.print(rs.getString("si_name") + ",");
				System.out.print(rs.getString("si_genre") + ",");
				System.out.print(rs.getString("si_singer") + ",");
				System.out.println(rs.getString("si_creadat"));
			}
			
//			while(rs.next()) {
//				String str = rs.getString("si_num") +",";
//				str += rs.getString("si_name") +",";
//				str += rs.getString("si_genre") +",";
//				str += rs.getString("si_singer") +",";
//				str += rs.getString("si_creadat") +"";
//				System.out.println(str);
//			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		
	}
}
