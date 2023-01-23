package String_class;
import java.util.*;
public class A3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				System.out.println("enter the string");
		String s1= sc.next();
		String s2 ="";
		for(int i =0;i<s1.length();i++ ) {
			if(s1.charAt(i)>='1' && s1.charAt(i)<='9')
				s2+=s1.charAt(i);
		}
		System.out.println(s2);
	}
	

}
