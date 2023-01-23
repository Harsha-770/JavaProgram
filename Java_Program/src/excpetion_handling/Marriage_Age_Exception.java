package excpetion_handling;

import java.util.Scanner;

class Marriage_Age_Exception extends RuntimeException{
	 
	 Marriage_Age_Exception(String msg){
		 super(msg);
	 }

}
 class Driver3{
	 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the age");
		int age = sc.nextInt();
		if(age>=21)
			System.out.println("you can marry");
		else
			throw new Marriage_Age_Exception("you cant marry");
		
			
			
		}
	}
 
