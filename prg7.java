package lab_NP;
import java.util.StringTokenizer;
import java.io.*;

public class prg7 {
	public static void main(String[] args) throws IOException {
		try {
			FileReader file = new FileReader("C:\\Users\\CSE\\eclipse-workspace\\lab_NP\\src\\lab_NP\\inp5.txt");
			BufferedReader reader = new BufferedReader(file);
			StringTokenizer st = new StringTokenizer(reader.readLine());
			int count = 0;
			while(st.hasMoreTokens())
			{
				count++;
				st.nextToken();
			}
			System.out.println(count);
			reader.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}