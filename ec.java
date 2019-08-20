
import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Random.*;
import java.util.Scanner.*;

class random
{
    int i;
    int sum=0;		
		int k []=new int[8];
        for(i =0;i<8;i++)
        {
            Random r= new Random();
               k[i]= r.nextInt(8);
            System.out.print(" "+ k[i]);
	sum =sum+ k[i];
        }
      return sum; 
    }
    
}



class ec
{
	public static void main (String[] args) 
	{
	random ran =new random();
	ran.gen(7);
	System.out.println(ran.gen(7));
	}
}

