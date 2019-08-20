import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner.*;

 class person
{
        public String name;
        public String lname ;
        public int age ;
    public person(String name ,String lname,int age){
        this.name =name;
        this.lname=lname;
        this.age=age;
    }public person(){}
        
    
    
	public static void main (String[] args) throws java.lang.Exception
	{
		person Person = new person();
		Person.name ="yogi";
	    Person.lname ="rowle";
	    Person.age=22;
	    System.out.println("person is " +Person.name+ "\b " + Person.lname +" having age :" + Person.age);
	    
	}
}

