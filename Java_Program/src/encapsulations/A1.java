package encapsulations;
import java.util.*;
 class A1 {
	private String name;
	private  String password ;
	private int marks;
	private String id;
	
	public void setmark_n_id_Name(int marks, String id,String name) {
		
		this.marks = marks;
		this.id = id;
		this.name= name;
}
	public void  setPassword(String password,String newPsw) {
		if(this.password==password) {
			this.password=newPsw;
		}
		else {
			System.out.println("invalid psw");
		}
	 
	}
	public String getPassword() {
		return this.password;
	}
	public String getname() {
		return this.name;

	}
	public int getmarks() {
		return this.marks;
	}
	public String getid() {
		return this.id;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	}

}
 class A2{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		A1 a1 = new A1();
		a1.setmark_n_id_Name(123,"1VA15ME013","Harsha" );
		A1 a2 = new A1();
		a2.setmark_n_id_Name(420,"1VA15ME016", "HEMANTH S");
		A1 a3= new A1();
		a3.setmark_n_id_Name(840, "17BBS85060", "SHASHANK");
		System.out.println(a1.getname());
		System.out.println(a2.getname());
		System.out.println(a3.getname());
		System.out.println("enter the password");
		String input= sc.nextLine();
		
		
		
	}
}