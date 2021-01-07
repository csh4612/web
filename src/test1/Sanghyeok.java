package test1;

import java.util.Scanner;

public class Sanghyeok {

	public static void main(String[] args) {
		System.out.println("===================================");
		System.out.println("==============웰컴웰컴랜드=============");
		System.out.println("====================================");
		System.out.println("=========원하시는 직업을 입력해주세요========");
		System.out.println("==백수(1), 건물주(2), 개발자(3), 탈주(q)==");
		
		Scanner scan = new Scanner(System.in);
		String cmd ="";
		
		for(;;) {
			System.out.println("입력: ");
			cmd = scan.nextLine();
			if("q".equals(cmd)) {
				System.out.println("탈주 ");
				break;
			}
			if("1".equals(cmd)) {
				System.out.println("백수 ");
				System.out.println("다시 선택할 기회를 주겠다. ");
			}else if("2".equals(cmd)) {
				System.out.println("건물주");
				System.out.println("다시 선택할 기회를 주겠다. ");
			}else if("3".equals(cmd)) {
				System.out.println("개발자");
				System.out.println("다시 선택할 기회를 주겠다. ");
			}else {
				System.out.println("직업을 골라주세요.");
			}
		}
		
		
	}		
}


