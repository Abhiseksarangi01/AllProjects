import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {
public static void main(String[] args) throws FileNotFoundException{
	
	File file=new File("D:\\data1.txt");
	Scanner sc=new Scanner(file);
	
	//try (BufferedReader br = new BufferedReader(new FileReader(file))) {
		
		while(sc.hasNextLine()) {
			
		System.out.println(sc.nextLine());
		
		}
//		while(line=br.readLine()!=null) {
//			String[] values=line.split(",");
//			System.out.println(values[1]);
//			
		}
	
	
}
}
