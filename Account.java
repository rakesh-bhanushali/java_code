import java.util.*;
import java.lang.*;
import java.io.*;

class Account
{
    int id;
    double balance;
    double air;
    public Account(int id,double balance,double air){
        this.id=id;
        this.balance=balance;
        this.air=air;
        }
    
    
    
	public static void main (String[] args) throws java.lang.Exception
	{
	Account account= new Account(1,500.0,5.5);
	account.id=1;
	account.balance=50000;
	account.air=5;
	System.out.println("id :"+account.id+" balance is "+account.balance+" insterset is "+account.air);
	
	
	
	}
}

