package inheritance;
import java.util.*;
public class Power3 {
	static int power(int rem, int count) {
	int power =1;
	for(int i=1;i<=count;i++) {
		power = power *rem;
	}
	return power;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the start range");
		int a =sc.nextInt();
		System.out.println("enter the end range");
		int b = sc.nextInt();
		for(int i =a; i<=b;i++) {
			int temp =i;
			int count =0;
			int sum =0;
			int c = temp;
			int d = c;
			while(temp>0) {
				count++;
				temp=temp/10;
			}
			while(c>0) {
				int rem =c%10;
				sum = sum+power(rem,count);
				c = c/10;
			}
			if(sum==d)
				System.out.println(sum +" is a am strong number");
			}
		}


	}


