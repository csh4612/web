package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertBookInfo {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			Connection con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521/xe","jtest","ezen1234");
			Statement stmt = con.createStatement();
			String sql = "insert into book_info(bi_num, bi_name, bi_writer, bi_vendor, bi_credat)";
			
			int cnt = stmt.executeUpdate(sql + " values(1, '달러구트 꿈 백화점', '이미예', '팩토리나인', '20200708')");
			cnt += stmt.executeUpdate(sql + " values(2, '공정하다는 착각', '마이클 샌델', '와이즈베리', '20201201')");
			cnt += stmt.executeUpdate(sql + " values(3, '광고의 8법칙', '오두환', '대한출판사', '20201123')");
			cnt += stmt.executeUpdate(sql + " values(4, '안녕, 소중한 사람', '정한경', '북로망스', '20200916')");
			
			System.out.println(cnt + "개 입력됨");
			con.commit();
					
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
