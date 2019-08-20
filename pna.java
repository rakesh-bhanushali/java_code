import java.util.*;

import java.io.*;
import java.util.Scanner.*;

  class pna
    {
    	public static void main (String[] args) 
    	{
    	    int number;
    		int positive =0;
    		int negative =0;
    		int count=0;
    		double total =0 ;
    		double  avg =0;
    		
    		System.out.print("Enter the number : ");
    		Scanner sc = new Scanner(System.in);
    		
    		while((number =sc.nextInt()) !=0)
    		{
    	    count++;
    	    total = total + number;
    		if(number > 0)
    		{positive = positive+ 1;}
           else if(number < 0)
           {
             negative++;
            
           }
}
avg = total/count;
System.out.println("average  = "+avg);
System.out.println("total  = "+ total);
System.out.println("positive no. :  = "+ positive);
System.out.println("negative no. :  = "+ negative);
}}
