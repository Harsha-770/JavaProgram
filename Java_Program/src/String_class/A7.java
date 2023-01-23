package String_class;
import java.util.*;
public class A7 {
	public static String revString(String s2) {
		String rev= "";
		for(int i=s2.length()-1; i>=0;i--) {
			rev = rev+s2.charAt(i);
		}
		return rev;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String s1 = sc.nextLine();
		System.out.println("Enter the index");
		int a = sc.nextInt();
		s1 = s1.substring(a);
		System.out.println(s1);
		
		System.out.println(revString(s1));
		String s2= revString(s1);
		if(s1.equals(s2))
			System.out.println(s1+" is a palindrome");
		else
			System.out.println(s1+" is not palindrome");
	}

}
