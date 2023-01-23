package inheritance;

import java.util.*;

public class A91 {
	
	static void pattern(int a) {
		int m=a;
		int h = m*2;
			for(int i=0; i<h;i=i+2) {
				int k = i/2;
					for(int j=0;j<h;j++) {
						if(i+j>=h-1)
						System.out.print(Math.abs(k--)+" ");
						else 
							System.out.print(" ");
					}
					System.out.println();
				}
			for(int i=0; i<h;i=i+2) {
				int k = i/2;
					for(int j=0;j<h;j++) {
						if(i+j>=h-1)
						System.out.print(" ");
						else 
							System.out.print(Math.abs(k--)+" ");
					}
					System.out.println();
				}
	}
		public static void main(String[]args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the row");
			int a = sc.nextInt();
			pattern(a);
		}
		

	}


