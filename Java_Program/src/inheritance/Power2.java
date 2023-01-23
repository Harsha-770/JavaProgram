package inheritance;
import java.util.Scanner;
public class Power2 {
	public static int power(int rem,int count){
		int power =1;
		for(int i=0; i<count;i++) {
			power = rem*power;
			
		}
		return power;
		}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int a = sc.nextInt();
		int temp = a;
		int b = temp;
		
		int count=0;
		int sum =0;
		while(a>0) {
			count++;
			a = a/10;	
		}
		System.out.println(count);
		while(temp>0) {
				int rem =temp%10;
				 power(rem,count);
				 sum =sum +power(rem, count);
				 temp = temp/10;
		}
		System.out.println();
		if(b==sum)
			System.out.println(b+ "is a amstrong number");
		else
			System.out.println("bye");
				
		}
		
		}
		
	

	

	


