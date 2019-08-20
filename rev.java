
import java.util.Scanner.*;
import java.util.*;
class rev
{
	public static void main (String[] args) 
	{
		int x,t =0;
		int c=0;
		System.out.print("enter no.:");
		Scanner sc = new Scanner(System.in);
		x =sc.nextInt();
		if(x>0){
                 while(x>0)
		{
                    t =x%10;
		    x =x/10;
		    c =c*10+t;
		    }
		System.out.println("reverse is .:"+c);}
else{
while(x<0)
		{
                    t =x%10;
		    x =x/10;
		    c =c*10+t;
		    }
		System.out.println("reverse is .:"+c);}

                                   
	}

}

