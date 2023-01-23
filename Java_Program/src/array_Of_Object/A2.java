package array_Of_Object;

import java.util.ArrayList;
import java.util.Iterator;

public class A2 {
	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		a1.add(5);
		a1.add(10);
		a1.add("bye");
		a1.add(14);
		a1.add(78);
		a1.add("hello");
		int sum =0;
		Iterator i1 = a1.iterator();
		while(i1.hasNext()) {
			Object var = i1.next();
			try {
				Integer var2 = (Integer)var;
				sum+=var2;
			}
			catch(Exception e){
				continue;

			}
		}
		System.out.println(sum);

	}

}
