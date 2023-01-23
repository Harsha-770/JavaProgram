package file_handling;
import java.io.*;
public class A2 {
	public static void main(String[] args) throws IOException {
		File file = new File("sharoon.txt");
		FileOutputStream fos = new FileOutputStream(file);
		
		fos.write("Abcd\n".getBytes());
		fos.write("I am harsha\n ".getBytes());
		fos.write("ShaShank is good boy\n".getBytes());
		fos.write("naveen is chutiya\n".getBytes());
		
	}

}
