package lab_NP;
import java.util.StringTokenizer;
import java.io.*;

public class prg5 {
	public static void main(String[] args) throws IOException {
		try {
			FileReader file = new FileReader("C:\\Users\\CSE\\eclipse-workspace\\lab_NP\\src\\lab_NP\\inp5.txt");
			BufferedReader reader = new BufferedReader(file);
			StringTokenizer st = new StringTokenizer(reader.readLine());
			while(st.hasMoreTokens())
			{
				System.out.println(st.nextToken());
			}
			
			reader.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		//BufferedReader reader = new BufferedReader(new FileReader(filePath + "/src/ProgramCount"));
	}
}