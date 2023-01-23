package mock;

import java.util.Scanner;

public class ToCountCharacter {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the String ");
		String s1 = sc.nextLine();
		for(char ch ='A';ch<'z';ch++) {
			int count=0;
			for(int i =0; i<s1.length();i++) {
				if(ch==s1.charAt(i))
					count++;
			}
			if(count>0)
				System.out.println(ch+"="+count);
		}
		
	}

}
