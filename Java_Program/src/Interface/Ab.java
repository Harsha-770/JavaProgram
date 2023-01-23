package Interface;
interface Abc{
	void shashank();
	int b =23;
	
}

 class Ab implements Abc {
	 int a =90;
	public void shashank() {
		System.out.println(" naveen");
	}
	Ab(){
		this.a =91;
		System.out.println(a);
	}
		

public static void main(String[] args) {
	Ab a1 = new Ab();
	a1.shashank();
	a1.a=92;
	System.out.println("1va15me013");
	System.out.println(a1.a);
	}
}