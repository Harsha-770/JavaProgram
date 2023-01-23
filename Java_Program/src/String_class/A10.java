package String_class;

public class A10 {
public static void main(String[] args) {
	String s1 = "asdafda";
	char ch[]=s1.toCharArray();
	for(int i = s1.length()-1;i>=0;i--) {
		System.out.println(ch[i]);
	}
}
}
