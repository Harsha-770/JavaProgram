package Assignment;

public class A2 {
	public static void main(String[] args) {
		String s1= "the name is yash";
		String s2[]= s1.split(" ");
		String s3 ="";
		for(int i =0; i<s2.length;i++) {
			String var =s2[i];
			if(var.equals("yash")) {
				var =var.toUpperCase();
				s3 =s3+var+" ";
			}
			else
				s3=s3+var+" ";
		}
		System.out.println(s3);
	}

}
