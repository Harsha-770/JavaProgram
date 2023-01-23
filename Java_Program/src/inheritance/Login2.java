package inheritance;

public class Login2 extends login {
	public 	void username() {
		System.out.println("accepts 10 charcter");
			
		}
	public void password() {
		System.out.println("Accepts 11 char");
}
public void loginButton(){
	System.out.println("just double clicks");
	
}
public static void main(String[] args) {
	Login2 a1 = new Login2();
	login a2 = new login();
	a2=a1;
	a2.username();
	
	
	
}
	

}
