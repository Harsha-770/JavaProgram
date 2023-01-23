package object_class;

public class A1 {
	int mileage;
	String car;
	static String sentence ="mileage";

	A1(String name , int kilometer){
		this.car = name;
		
				this .mileage=kilometer;
	}
	public String toString() {
		return this.car+" "+A1.sentence+" "+this.mileage;
		
	}
	public static void main(String[] args) {
		A1 a1 = new A1("tata",100);
		A1	a2 = new A1("Mahendra",250);
		System.out.println(a1);
		System.out.println(a2);
	}

}
