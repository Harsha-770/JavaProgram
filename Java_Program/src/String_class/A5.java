package String_class;

public class A5 {
	public static void main(String[] args) {
		String s1 ="Harsha";
		int count =0;
		char ch[] = {'A','E','I','O','U','a','e','i','o','u'};
		for(int i=0; i<s1.length();i++) {
			for(int j =0;j<ch.length;j++)
				if(s1.charAt(i)==ch[j])
				count++;
		}
		System.out.println(count);
		
	}

}
