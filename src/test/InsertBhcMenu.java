package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertBhcMenu {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			Connection con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521/xe", "jtest", "ezen1234");
			Statement stmt = con.createStatement();
			String sql = "insert into bhc_menu(bm_num, bm_name, bm_type, bm_price, bm_dese)";
			
			int cnt = stmt.executeUpdate(sql + "values(1, '뿌링클콤보','치킨',18000,'뿌링뿌링! 세상에 없던 마법의 맛, 뿌링클, 퍽퍽한 닭가슴살 없이 윙과 닭다리만 담은 콤보(소스포함)')");
			cnt += stmt.executeUpdate(sql + "values(2, '맛초킹콤보', '치킨', 18000, '매콤짭잘! 밥과 함께 먹기에 딱 좋은 맵짠의 완벽조합, 퍽퍽한 닭가슴살 없이 윙과 닭다리만 담은 콤보')");
			cnt += stmt.executeUpdate(sql + "values(3, '뿌링소떡','사이드',3000,'뿌링뿌링, 마법의 가루가 더해진 소시지와 떡의 찰떡궁합 쫄깃달콤한 소떡')");
			cnt += stmt.executeUpdate(sql + "values(4, '뿌링감자','사이드',5000,'뿌링뿌링 마법의 가루가 더해진 바삭한 케이준 프라이')");
			
//			sql += "values(1, '뿌링클콤보','치킨',18000,'뿌링뿌링! 세상에 없던 마법의 맛, 뿌링클, 퍽퍽한 닭가슴살 없이 윙과 닭다리만 담은 콤보(소스포함)')";
//			sql += "values(2, '맛초킹콤보', '치킨', 18000, '매콤짭잘! 밥과 함께 먹기에 딱 좋은 맵짠의 완벽조합, 퍽퍽한 닭가슴살 없이 윙과 닭다리만 담은 콤보')";
//			sql += "values(3, '뿌링소떡','사이드',3000,'뿌링뿌링, 마법의 가루가 더해진 소시지와 떡의 찰떡궁합 쫄깃달콤한 소떡')";
//			sql += "values(4, '뿌링감자','사이드',5000,'뿌링뿌링 마법의 가루가 더해진 바삭한 케이준 프라이')";
			
//			int result = stmt.executeUpdate(sql);
			System.out.println(cnt + "개 insert되었음");
			
			con.commit();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}

}
