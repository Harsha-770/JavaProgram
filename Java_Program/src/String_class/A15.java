package String_class;

import java.util.Scanner;

public class A15 {
	public static String reverese(String s1) {
		String rev="";
		for(int i= s1.length()-1;i>=0;i--) {
			rev = rev+s1.charAt(i);
		}
		return rev;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner  (System.in);
		System.out.println("enter the String");
		String s1 = sc.nextLine();
		System.out.println("enter the character where it needs to be split");
		String s4 = sc.nextLine();
		System.out.println("enter the word that need to be reveresed ");
		String s5= sc.nextLine();
		String s2[] = s1.split(s4);
		String rev = "";
	for(int i=0; i<s2.length;i++) {
		String var  =s2[i];
		if(var.equals(s5))
			rev= rev+ reverese(var)+" ";
		else
			rev= rev+var+" ";
	}
	System.out.println(rev);
	}
	}
	
	
	
	
	
	