package harsha;
import java.util.Scanner;
public class Power {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the start");
		int a =sc.nextInt();
		System.out.println("enter the end ");
		int b = sc.nextInt();
		System.out.println("enter the power value");
		int c = sc.nextInt();
		for(int i =a;i<=b;i++) {
			System.out.println(i+ "="+(int)Math.pow(i, c));
		}
		
	}

}
