package abstractions;

public abstract class book {
	
	public void cover() {
		System.out.println("hardbind");
	}
	void lengthofbook() {
		System.out.println("30cm");
	}
	void breadthofbook() {
		System.out.println("22cm");
	}
	abstract void colourOfBook();
	abstract void  noOfpages();

}
