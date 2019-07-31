// Java program to read data of various types using Scanner class. 
import java.util.Scanner; 
public class prg4 
{ 
	public static void main(String[] args) 
	{ 
		
		Scanner sc = new Scanner(System.in); 
		String name = sc.nextLine(); 		
		long rollno = sc.nextLong(); 
		double cgpa = sc.nextDouble(); 
		System.out.println("Name: "+name); 
		System.out.println("Roll Number: "+rollno); 
		System.out.println("GPA: "+cgpa); 
	} 
} 
