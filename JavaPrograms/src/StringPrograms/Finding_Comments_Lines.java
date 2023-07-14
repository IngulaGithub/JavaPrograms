package StringPrograms;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Finding_Comments_Lines {

	public static void main(String[] args) throws IOException  {
	
		      Scanner sc = new Scanner(new File("HelloWorld"));
		      String input;
		      int single = 0;
		      int multiLine = 0;
		      while (sc.hasNextLine()) {
		         input = sc.nextLine();
		         if (input.contains("/*")) {
		            multiLine ++;
		         }
		         if(input.contains("//")) {
		            single ++;
		         }
		      }
		      System.out.println("no.of single line comments ::"+single);
		      System.out.println("no.of single line comments ::"+multiLine);
		   }
		

	}


