package Assignment;

public class A3 {
	public static void main(String[] args) {
		String s1 ="I LOVE JAVA CODING";
		char s2[] = s1.toCharArray();
		for(char var='A';var<='z';var++) {
			int count=0;
			for(int i=0;i<s1.length();i++) {
				char ch=s1.charAt(i);
				if(ch==var) {
					count++;
				}
			}
			if(count>0) {
				System.out.println(var+"-is  "+count);
			}

		}
	}
		
	}


