package excpetion_handling;

public class A2 {
	public static void add() {
		sub();
		System.out.println(1);
	}
	public static void sub() {
		multi();
		System.out.println(2);
	}
	public static void multi() {
		try {
			System.out.println(2/0);
		}

		catch(Exception e) {
			System.out.println("execption handled ");
		}
		System.out.println(0);
	}
	public static void main(String[] args) {
		add();
	}

}
