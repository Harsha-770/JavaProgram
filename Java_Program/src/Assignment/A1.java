package Assignment;

public class A1 {
	public static void main(String[] args) {
		String s1 = "Ramanna is my name ";
		String s2[]= s1.split(" ");
		String max=s2[0];
		int max1=s2[0].length();
		for(int i=0;i<s2.length;i++) {
			if(max1<s2[i].length()) {
				max=s2[i];
			}
		}
		System.out.println(max);
	}

}

