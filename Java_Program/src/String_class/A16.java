package String_class;

import java.util.Scanner;

public class A16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the String");
		String s1 = sc.nextLine();
		System.out.println("enter the word which want to be replaced ");
		String s5 = sc.nextLine();
		System.out.println("enter the word which need to inserted i");
		String s6 = sc.nextLine();
		String s2[]= s1.split(" ");
		String s3 ="";
		for(int i =0; i<s2.length; i++) {
			String var = s2[i];
			if(var.equals(s5)) {
				var = s6;
				s3= s3+ var+" ";
			}
			else
				s3= s3+var+" ";
		}
		System.out.println(s3);
		
	}

}
