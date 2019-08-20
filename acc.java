
import java.util.*;
import java.io.*;
import java.util.Scanner.*;

class acc
{
	public static void main (String[] args) throws java.lang.Exception
	{
		System.out.print("Enter ur name :");
	    Scanner sc =new Scanner(System.in);
	    String name = sc.nextLine();
	   
	    System.out.print("Enter ur lastname :");
	    String lastname = sc.nextLine();
	   
	    System.out.print("Enter ur age :");
	    int age = sc.nextInt();
	   
	    System.out.print("Enter ur address :");
	    String add = sc.nextLine(); 
	   
	    System.out.print("Enter ur birthday :");
	    String birth = sc.nextLine();
	    
	    String b = sc.nextLine();
	   
	   System.out.println("u r is   \'" +name +lastname + "\' born on " + birth +  " having age "+ age+" living at "+ add);
	    
	}
}

