package mock;

import java.util.Arrays;

public class Duplicatearrayremoval {
	public static void main(String[] args) {
		int a[] = {2,4,56,6,3,2,4};
		System.out.println("the size of the array "+a.length);
		
		int count=0;
		int b[] = new int[a.length];
		for(int j=0;j<a.length;j++) {
			for(int k =j+1;k<a.length;k++) {
				if(a[j]>a[k]) {
					int temp = a[j];
					a[j]= a[k];
					a[k]=temp;
				}
			}
			
		}
		int var = 0;
		for(int i=0;i<a.length-1;i++) {
			if(a[i]!=a[i+1]) {
				b[var++]=a[i];
			}
		}
		b[var]=a[a.length-1];
		System.out.println("Arry without dulicate element");	
		for(int i=0;i<=var;i++) {
			System.out.println(b[i]);
		}
		
	}

	

}
