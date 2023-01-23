package Assignment;

public class A6 {
	public static String reverse(String s) {
	String rev ="";
	for(int i = s.length()-1; i>=0;i--) {
		rev = rev+s.charAt(i);
		}
	return rev;
	}
	public static void main(String[] args) {
		String s1 = " hi hello 'uncle' how are 'you' doing";
		String s2 [] = s1.split(" ");
		String s3 = "";
		for(int i=0; i<s2.length; i++) {
			String var = s2[i];
					if(var.startsWith("'", 0)) {
						s3 = s3+reverse(var)+" ";
					}
					else {
						s3=s3+var+" ";
					}
					
		}
		System.out.println(s3);
	}

}
