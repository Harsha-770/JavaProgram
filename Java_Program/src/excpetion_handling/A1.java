package excpetion_handling;

import java.io.IOException;

public class A1 {
	public static void main(String[] args) {
		try {
			System.out.println(1);
			System.out.println(2);
			System.out.println(1/0);
			int a[] = {1,2,3,4,5};
			System.out.println(a[a.length]);
			System.out.println(3);
			System.out.println(4);
		}
		catch(ArithmeticException e) {
			System.out.println("execption handled");
		}
		catch(NullPointerException c) {
			System.out.println("exeption handled-1");
			
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("execption handled -2");
			
		}
		System.out.println("hello");
	}

}
