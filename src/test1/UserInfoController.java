package test1;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UserInfoController {
	
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("추가하실 번호, 이름, 아이디, 비밀번호를 적어주세요.");
		System.out.print("번호 : ");
		int uiNum = Integer.parseInt(scan.nextLine());
		System.out.print("이름 : ");
		String uiName = "'" + scan.nextLine() + "'";
		System.out.print("아이디 : ");
		String uiId = "'" + scan.nextLine() + "'";
		System.out.print("비밀번호 : ");
		String uiPassword = "'" + scan.nextLine() + "'";
		
		
		Connection con = DBConn.getConn();
		
		
		try {
			Statement stmt = con.createStatement();
			String sql = "insert into user_info(ui_num, ui_name, ui_id, ui_pwd)";
			
			sql += " values(" + uiNum + "," + uiName +"," + uiId + "," + uiPassword + ")";
			
			int cnt = stmt.executeUpdate(sql);
			
			System.out.println(cnt + "개 입력되었습니다.");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}
}
