package Interface;
interface I2{
	int a= 23;

	abstract int  add(int a);
	abstract int  sub(int b);
	
}
interface I3{
	int b =45;
	abstract int  multi(int c);
	abstract int divi(int d);
}

public class A2 implements I2,I3{
	public int add(int a) {
		int b =23;
			
				int c = a+b;
				return c;
		
	}
	public int  sub(int b) {	
		int e =23;
				int c =e-b;
				return c;
	}
	public int divi(int c) {
		int d =23;
		int e =d/c;
		return e;
	}
		
	
		public int multi(int d) {
		int e =32;
		int f= e*d;
		return f;
	}
	public static void main(String[] args) {
		I2 a = new A2();
		I3 b = new A2();
		System.out.println(a.add(2));
		System.out.println(a.sub(4));
		System.out.println(b.multi(2));
		System.out.println(b.divi(2));
		
}

}
