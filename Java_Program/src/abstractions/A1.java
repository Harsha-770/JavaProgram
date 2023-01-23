package abstractions;

  abstract class A4 {
	abstract public void add();
	abstract public void sub();
	abstract public void divi();
	abstract public void multi();

}
abstract class A2 extends A4{
	public void add() {
		System.out.println(2);
	
	}
	public void sub() {
		System.out.println(1);
	}
}
class A1 extends A2{
	public void divi() {
		System.out.println(3);
	}
	public void multi() {
		System.out.println(4);
	}
	public static void main(String[] args) {
		A1 a1 = new A1();
		a1.add();
		a1.divi();
		a1.sub();
		a1.multi();
	}
	
}