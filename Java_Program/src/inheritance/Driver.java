package inheritance;

public class Driver {

	public static void main(String[] args) {
		Enjoy e1 = new Enjoy();
		A21 a1 = new A21();
		A21 a2 = new A22();
		A21 a3 = new A23();
		e1.via(a1);
		e1.via(a2);
		e1.via(a3);
		A22 b = new A22();
				e1.via(b);
		A23 c = new A23();
				e1.via(c);
	}

}
