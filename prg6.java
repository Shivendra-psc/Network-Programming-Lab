package lab_NP;
import java.util.Scanner;
import java.io.*;

public class prg6 {
	public static void main(String[] args) throws IOException {
		try {
			FileReader file = new FileReader("C:\\Users\\CSE\\eclipse-workspace\\lab_NP\\src\\lab_NP\\inp5.txt");
			BufferedReader reader = new BufferedReader(file);
			Scanner st = new Scanner(reader.readLine());
			int intc=0, floatc=0,strc=0;
			while(st.hasNext())
			{
				if (st.hasNextInt())
					intc++;	
				else if (st.hasNextFloat())
					floatc++;	
				else 
					strc++;
				st.next();	
			}
			st.close();
			System.out.printf( "String count: %d, Int count:%d, Float count: %d", strc, intc, floatc);
			reader.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		//BufferedReader reader = new BufferedReader(new FileReader(filePath + "/src/ProgramCount"));
	}
}