package encapsulations;
import java.util.*;
public class Deposite_n_withdrwal {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		user  a1 = new user();
		System.out.println("enter the user name");
		String s1 = sc.nextLine();
		a1.setUsername(s1);
		System.out.println("Enter the pin");
		int a = sc.nextInt();
		if(a==a1.getPin()) {
			System.out.println("enter the amount in multiples of 100");
			int b = sc.nextInt();
			if(b%100==0)
			a1.setBal(b);
			else
				System.out.println(" invalid amount");
		}
		else {
			System.out.println("Invalid  wrong pin");
		}
		
		System.out.println(a1.getBal());
	}
	

}
class user{
	private String Username;
	private int pin=1234;
	private int bal;
	
	public String getUsername() {
		return this.Username; 
	}
	public void setUsername(String s1) {
		this.Username= s1;
	}
	public int getPin() {
		return this.pin;
	}
	public void setBal(int a) {
		
			this.bal = this.bal+a;
		
	}
	public int getBal() {
			return this.bal;
		}
		
	}
