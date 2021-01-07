package test2;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentInfoController {
	public static void main(String[] args) {
		DBConnectionTest.loadDriver();
		Connection con = DBConnectionTest.getConnection();
		
		//insert
		try {
			Statement stmt = con.createStatement();
			String sql = "insert into student_info(si_num, si_name, si_etc)";
			
			int cnt = stmt.executeUpdate(sql + " values(1, '상혁', '상혁')");
			cnt += stmt.executeUpdate(sql + " values(2, '혁', '혁')");
			System.out.println(cnt + "개 입력됨");			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		//select
		try {
			Statement stmt = con.createStatement();
			String sql = "select * from student_info";
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				String str = "번호 : " + rs.getString("si_num") +",";
				str += "이름 : " + rs.getString("si_name") + ",";
				str += "비고 : " + rs.getString("si_etc");
				System.out.println(str);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		//update
		try {
			Statement stmt = con.createStatement();
			String sql = "update student_info";
			sql += " set si_name = '최상혁',";
			sql += " si_etc = '최상혁'";
			sql += " where si_num = 2";
			
			int cnt = stmt.executeUpdate(sql);
			System.out.println(cnt + "개 업데이트 됨");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		//delete
		try {
			Statement stmt = con.createStatement();
			String sql = "delete from student_info where si_num = 1 or si_name = '최상혁'";
			
			int cnt = stmt.executeUpdate(sql);
			System.out.println(cnt + "개 삭제됨");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		DBConnectionTest.close(con);
		System.out.println("프로그램 정상종료");
	}
}
