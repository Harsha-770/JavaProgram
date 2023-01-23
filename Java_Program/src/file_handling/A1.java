package file_handling;
import java.io.*;

public class A1 {
public static void main(String[] args) throws IOException {
	File f1 = new File("sharoon.txt");
	if(!f1.exists()) {
		f1.createNewFile();
		System.out.println("file Created");
	}
	else
	{
		System.out.println("file not created");
	}
}
}
 