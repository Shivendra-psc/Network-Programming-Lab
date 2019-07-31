import java.util.StringTokenizer;
public class prg1
{
	public static void main (String args[])
	{
		StringTokenizer st = new StringTokenizer ("My name is xyz", " ");
		while (st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}
	}
}