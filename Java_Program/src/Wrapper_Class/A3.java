package Wrapper_Class;

import java.util.Scanner;

public class A3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String s1 =sc.nextLine();
		String s2 = "";
		int z =0;
		int sum =1;
		for(int i =0; i<s1.length();i++) {
			char s = s1.charAt(i);
			if(s>='0'&& s<='9')
				s2 = s2+s;
			z=z+((int)s-48);
		}
		/*int n = Integer.parseInt(s2);
		System.out.println(n);
		while(n>0) {
			int rem = n%10;
			sum = sum *rem;
			n = n/10;
		}*/
		System.out.println(z);
			
	
	}
	

}
