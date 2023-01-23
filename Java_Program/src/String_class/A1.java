package String_class;

public class A1 {
	public static void main(String[] args) {
		String s1 = "RADAR";
		String s2 = "";
		int n =121;
		int temp =n;
		int sum =0;
		 int count =0; 
				 int k =0;
		 
				for (int i=0;i<s1.length();i++){
					if(s1.charAt(i)!=' ')
					System.out.print(s1.charAt(i));
		}
				System.out.println();
				for (int i=s1.length()-1;i>=0;i--){
					if(s1.charAt(i)=='A'||s1.charAt(i)=='a')
						count++;
		}
				System.out.println(count);
				System.out.println();
				for (int i=s1.length()-1;i>=0;i--){
					s2+=s1.charAt(i);
					
				}
					System.out.println(s2);
					if(s1.equals(s2))
					System.out.println("it is a palindrome");
					else 
						System.out.println("it is not a palindrome");
					while(n>0) {
						int rem = n%10;
						 sum = sum*10+rem;
						n = n/10;
					}
					System.out.println(sum);
						if(temp==sum)
							System.out.println("palindrome");
						else
							System.out.println("not palindrome");
	}
	

}