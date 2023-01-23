package file_handling;
import java.io.*;
public class A5 {
	public static void main(String[] args) throws IOException {
		File file = new File("Harsha txt");
		FileOutputStream fos = new FileOutputStream("Harsha.txt");
		fos.write("Abcd\n".getBytes());
		fos.write("I am harsha\n".getBytes());
		fos.write("I am shashanka\n".getBytes());
		FileInputStream fis = new FileInputStream("Harsha.txt");
		int i =fis.read();
		while(i!=-1) {
			System.out.print((char)i);
			i=fis.read();
		}
		fis.close();
		file.delete();
			 file = new File("F1.txt");
		 if(!file.exists());{
			file.createNewFile();
			System.out.println("file Created");
			FileOutputStream F1 = new FileOutputStream("F1.txt");
			F1.write("hi elf\n".getBytes());
			F1.write("shashanka is my bestFriend\n".getBytes());
			F1.write("naren is genious boy\n".getBytes());
			F1.write("loki is lord of mischief\n".getBytes());
			F1.write("hemu is good boy\n".getBytes());
			FileInputStream F2 = new FileInputStream("F1.txt");
			int j = F2.read();
			while(j!=-1) {
				System.out.print((char)j);
				j=F2.read();
			}
			 } 
			 
		
			
		}
		 
	}


