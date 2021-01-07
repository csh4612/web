package test3;
class F{
	public F() {
		System.out.println("난 F 생성자");
	}
}
public class Constructor extends F {
	public Constructor() {
		this("하하");
		System.out.println("기본 생성자");
	}
	public Constructor(String str) {
		super();
		System.out.println("기본 생성자");
	}
}

class Execute{
	public static void main(String[] args) {
		new Constructor();
	}
}

