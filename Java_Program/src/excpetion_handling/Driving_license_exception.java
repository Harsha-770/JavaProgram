package excpetion_handling;

import java.util.Scanner;

public class Driving_license_exception extends RuntimeException{
	
	Driving_license_exception(String msg){
		super(msg);
	}

}
class Driver2{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the age");
		int age = sc.nextInt();
		if(age>18)
			System.out.println("you can apply for licsense");
		else
			throw new Driving_license_exception("you can ride cycle only");
		
	}
}
