//Wap that parses a given string using split() method of string class (delimiter is underscore)

public class prg2 
{
	public static void main(String[] args) 
	{
		String s = "This is the message from NIT Raipur";
		String arr[] =s.split("i"); 
		for(String token : arr)
		{
			System.out.println(token);
		}
	}
}
