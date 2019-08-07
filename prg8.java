package lab_NP;
import java.util.StringTokenizer;

import java.io.*;

public class prg8 {
	public static void main(String[] args) throws IOException {
		try {
			FileReader file = new FileReader("C:\\Users\\CSE\\eclipse-workspace\\lab_NP\\src\\lab_NP\\inp8.txt");
			BufferedReader reader = new BufferedReader(file);
			StringTokenizer st = new StringTokenizer(reader.readLine());
			int count = 0;
			String[] url;
			while(st.hasMoreTokens())
			{
				//url = st.nextToken().split("?");
				for (String s: st.nextToken().split("\\?")[1].split("\\=")) {
					if (count==0)
						System.out.println("Key:"+ s);
					else
						System.out.println("Value: "+ s);
					count =1-count;
				}
			}
			reader.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}