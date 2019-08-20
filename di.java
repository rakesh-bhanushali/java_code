
import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Random.*;
class di
{
	public static void main (String[] args) 
	{
	int count = 0;
	int dice;
         Random gen =new Random();
         dice =gen.nextInt(6) + 1;
	
while(dice != 6) {
	dice =gen.nextInt(6) + 1;
	    System.out.println("rolled no.: " + dice);
	    count++ ;
	    
	}
	System.out.println("In took  " + count +"  to arrive 6");
	}
}
