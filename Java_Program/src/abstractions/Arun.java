package abstractions;

public class Arun extends book{
	public  void  noOfpages() {
		System.out.println("98");
	}
		public void colourOfBook() {
			System.out.println("Blue");
		}
		public static void main(String[] args) {
			book  b1 = new Arun();
			b1.colourOfBook();
			b1.noOfpages();
			b1.cover();
			b1.lengthofbook();
			b1.breadthofbook();
		}
	}


