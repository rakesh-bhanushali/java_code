
import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner.*;

class fibo
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int i=0;
		int a=0;
		int b=1;
		int temp =0;
		int c;
		System.out.print("enter no.:");
		System.out.println("0   1");
		Scanner sc =new Scanner(System.in);
		c= sc.nextInt();
		
		
while(c>i)
		{
		temp=a+b;
		a=b;
		b=temp;
		System.out.print(temp+ ",");
		i++;
		    
		}     
		
		    
		    
		
	}
}

