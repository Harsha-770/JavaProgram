package String_class;
import java.util.*;
public class A12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the string");
		String s1 = sc.nextLine();
		System.out.println("enter the character that needs to be converted to UPPER CASE");
		char ch = sc.next().charAt(0);
		String s2 = "";
		
		for(int i=0;i<s1.length();i++) {
			char var=s1.charAt(i);
			if(var==ch) {
				String s3="";
				s3=s3+var;
				s3=s3.toUpperCase();
				s2=s2+s3;
			}
				else
				s2 = s2+var; 
		}
		System.out.println(s2);
	}

}
