package mock;

public class SumofCompositeNum {
public static void main(String[] args) {
	
	int sum =0;
	for(int i =2; i<=30;i++) {
		boolean key = true;
		for(int j =2; j<i;j++) {
			
			if(i%j==0) {
				key = false;
			break;
			}
		}
		if(key == false)
			System.out.println(i);
		sum = sum +i;
	}
	System.out.println(sum);
}
}

	 


