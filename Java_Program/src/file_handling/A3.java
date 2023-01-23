package file_handling;
import java.io.*;
public class A3 {
	public static void main(String[] args) throws IOException {
		File file = new File("sharoon.txt");
		FileInputStream fis = new FileInputStream(file);
		int i = fis.read();
		while(i!=-1) {
			System.out.print((char)i);
			i = fis.read();
		}
	
	
				
		
	}

}
