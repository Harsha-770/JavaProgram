package Wrapper_Class;

public class A1 {
	public static void main(String[] args) {
		int a = 10;
		System.out.println(a);
		Integer c = Integer.valueOf(a);
		System.out.println(c);
			c = 120;
		System.out.println(c.toString());
		c=a;
		System.out.println(c.toString());
	}

}
