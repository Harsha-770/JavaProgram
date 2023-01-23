package inheritance;
import java.util.*;
public class Ascending {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		System.out.println("enter the size of an array");
		int b = sc.nextInt();
		int a[] = new int [b];
		System.out.println("enter the elements of an array");
		for(int l=0;l<a.length;l++) {
			a[l]=sc.nextInt();
		}
		for(int i=0; i<a.length;i++) {
				for(int j=1+i;j<a.length;j++) {
					 if(a[i]>a[j]) {
						 int temp = a[i];
						 a[i]=a[j];
						 a[j]=temp;
					 }
					 
				}
		}
		System.out.println("the arranged array is ");
		 for(int k=0;k<a.length;k++) {
			 System.out.println(a[k]);
			 
			 	
		 }
		
		
	}

}
