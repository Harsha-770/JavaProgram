package Wrapper_Class;

import java.util.Scanner;

public class A2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String s1 =sc.nextLine();
		String s2 = "";
		for(int i =0; i<s1.length();i++) {
			char s = s1.charAt(i);
			if(s>='0'&& s<='9')
				s2 = s2+s;
				
		}
		int n = Integer.parseInt(s2);
		System.out.println(n);
	}

}
