package jwc.db.cons;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class dd {
	public static void main(String[] args) {
		Connection con = DBConnector.open();
		
		try {
			Statement stmt = con.createStatement();
			String sql = "select * from User_info";
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				String str = rs.getString("ui_num") + ",";
				str += rs.getString("ui_name") + ",";
				str += rs.getString("ui_age");
				System.out.println(str);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		DBConnector.close(con);
		System.out.println("프로그램 정상종료");
   }
}
