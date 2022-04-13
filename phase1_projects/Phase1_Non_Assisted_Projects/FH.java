package Phase1_Non_Assisted_Projects;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
public class FH {
	public static void main(String[] args)throws IOException {
		File f;
		f= new File("C://Users//MEGHA//Example/temp1.txt");
		if(f.createNewFile()) {
			System.out.println("The File is created succesfully");
			
		}else {
			System.out.println("The File already exit");

		}
		String ans="fgdjhgdrstsreadsasd";

		List<String> lines = new ArrayList<String>();
		lines.add("1st line");
		lines.add("2nd line");
		lines.add("3rd line");
		
		Files.write(Paths.get("C://Users//MEGHA//Example/temp1.txt"), lines, StandardOpenOption.CREATE); //use of write method();

		FileWriter writer= new FileWriter(f);
		writer.append(ans);                //use of append() ;
		writer.close();
		
		BufferedReader reader = new BufferedReader(new FileReader("C://Users//MEGHA//Example/temp"));//use of read();
		
		String Line=reader.readLine(); 
		while(Line!=null) {
		System.out.println(Line);
		Line=reader.readLine();
		}
		reader.close();
	}

}
