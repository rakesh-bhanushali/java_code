
import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Random.*;

class good
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    
	    System.out.print("Enter the no --> ");
	    Scanner sc = new Scanner(System.in);
	    int dice = sc.nextInt();
            
            if(dice<7 && dice>0){
	    Random  generator = new Random();
              int d = generator.nextInt(6) + 1 + generator.nextInt(6) + 1;
	    System.out.println("rolled number-->  " +d);
            
            if(d == dice){
	        System.out.println("Number is good number --> " + dice);
	    }
	    else{
	        System.out.println("Number is not good number --> " + dice);
	    }
	    
         
	}
	else{System.out.println("number "+dice +" is great than 6" );}
}
}

