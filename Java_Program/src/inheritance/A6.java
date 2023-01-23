package inheritance;

public class A6 extends A5 {
		int c = 40;
		int d = 50;
		public static void main(String[] args) {
				A6 a1 = new A6();
				A5 a2 = new A5();
				System.out.println(a1.c);
				System.out.println(a1.d);
				System.out.println(a2.c);
				System.out.println(a2.d);
		}
			

}
