package file_handling;
import java.io.*;
public class A4 {
	public static void main(String[] args)throws IOException {
		File f1 = new File("harsha.txt");
		if(!f1.exists()) {
			f1.createNewFile();
			System.out.println("file created");
		}
		else
		{
			System.out.println("file not created");
		}
		
	}

}
