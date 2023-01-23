package array_Of_Object;

public class A1 {
	String name;
	int rollno;
	static int count =0;
	A1(String name,int rollno ){
		count++;
		this.name=name;
		this.rollno= rollno;
		
	}
	public String toString() {
		return this.name+" "+this.rollno;
	}
	public int hashcode() {
		return this.rollno;
	}
	public boolean equals() {
		return true;
	}
	public static void main(String[] args) {
		A1 a1 =new A1 ("shashank",123);
		A1 a2 = new A1 ("Naveen",345);
		A1 a3 = new A1("Harsha ",123);
		A1 a5 = new A1("Naren", 345);
		A1 a[]=new A1[count];
		a[0]=a1;
		a[1]=a2;
		a[3]=a3;
		a[2]=a5;
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
			
		}


	}


