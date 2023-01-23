package mock;
//Write a program to word in string that Start with giving letter 
import java.util.Scanner;


public class Countwords {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the String ");
		String s1 = sc.nextLine();
		System.out.println("enter the letter ");
		String ch = sc.next();
		String s2[] = s1.split(" ");
	
		int count =0;
		for(int i =0; i<s2.length;i++) {
			String var = s2[i];
			if(var.startsWith(ch))
				count++;
		}
		System.out.println(count);

	}

}
