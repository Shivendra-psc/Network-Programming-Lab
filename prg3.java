import java.util.Scanner;
public class prg3
{
	public static void main(String[] args)
	{
		Scanner st= new Scanner ("This is  1  2  5.56  the string");
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
			
	}	
}