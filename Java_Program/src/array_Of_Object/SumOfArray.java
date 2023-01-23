package array_Of_Object;

public class SumOfArray {
	public static void main(String[] args) {
		String s1 = "[1,2,3,4,5,6,77]";
		//int a = (int)Integer.parseInt(s1);
		int sum =0;
		//System.out.println(a);
		/*for(int i =0; i<s1.length();i++) {
			char ch = s1.charAt(i);
			if(ch>=48 &&ch<=57) {
				int a = (int)ch;
				a =a-48;
				sum = sum+a;
			}
		}*/
		
		s1 = s1.replace("[", "");
		s1 = s1.replaceAll(",", " ");
		s1 = s1.replace("]", "");
		String s2[] = s1.split(" ");
		for(int i=0; i<s2.length;i++) {
			int a = (int)Integer.parseInt(s2[i]);
			sum = sum+a;
		}
		
		System.out.println(sum);
	}

}
