package String_class;

import java.util.Scanner;

public class A14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the String");
		String s1 = sc.nextLine();
		String s3="";
		System.out.println("enter the character is that needs be converted to lower case");
		char ch = sc.next().charAt(0);
		System.out.println("enter the character is that needs be converted to lower case");
		char ch1 = sc.next().charAt(0);
		for(int i =0;i<s1.length();i++) {
			String s2 ="";
			if(s1.charAt(i)==ch||s1.charAt(i)==ch1) {
				s2=s2+s1.charAt(i);
				s2=s2.toLowerCase();
				s3=s3+s2;
			}
			else
				s3=s3+s1.charAt(i);
		}
		System.out.println(s3);
		
	}

}
