package test2;

class Game{
	public Game() {
//		super();
		System.out.println("1");
	}
	public Game(int money) {
//		super();
		System.out.println("2");
	}
}

class LOL extends Game{
	public LOL() {
//		super(0);
//		super(); 인트 생성자면 super(1);
		System.out.println("3");
	}
	public LOL(int i) {
//		super();
//		super(); 인트 생성자면 super(1);
		System.out.println("4");
	}
}


public class InheritTest {
	public static void main(String[] args) {
		LOL lol = new LOL(0);
	}

}
