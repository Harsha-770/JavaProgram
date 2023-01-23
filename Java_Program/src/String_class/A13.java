package String_class;

import java.util.Scanner;

public class A13 {
	public static void main(String[] args) {
		int count = 0;
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the string");
		String s1 = sc.nextLine();
		System.out.println("enter the character needs to counted");
		char ch = sc.next().charAt(0);
		String s2="";
		 s2 = s2+ch;
			 if(s1.contains(s2))
				count++;
		if(count!=0)
		System.out.println("the character is present "+count+" times");
		else
			System.out.println("the character is not present");
		
	}

}
