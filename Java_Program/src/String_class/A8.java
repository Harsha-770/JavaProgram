package String_class;

public class A8 {
public static void main(String[] args) {
	String s1 = "chetaa";
	boolean res=false;
		for(int i=0;i<s1.length()-1;i++) {
				if(s1.charAt(i)==s1.charAt(i+1)) {
					res=true;
					break;
				}
				else
					res=false;
			
		}
		if(res)
			System.out.println("yes");
		else
			System.out.println("no");
		
}
}

