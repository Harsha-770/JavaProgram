package excpetion_handling;
import java.util.*;


 class young_age_Exception extends RuntimeException{
	
	young_age_Exception(String msg){
		super(msg);
	}
}
class Driver{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the age");
		int a = sc.nextInt();
		if(a>18)
			System.out.println("you can vote");
		else
			throw new young_age_Exception("you cant vote");
	}
}

