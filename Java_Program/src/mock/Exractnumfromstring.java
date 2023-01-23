package mock;

import java.util.Scanner;

//WAP to find the sum of integer in the given String “ABCD123DEF324”.
public class Exractnumfromstring {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the string");
		String s1 = sc.next();
		String s2 ="";
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)>=48 && s1.charAt(i)<=58) {
				s2=s2+s1.charAt(i);
			}
		}
		
		
	}

}
