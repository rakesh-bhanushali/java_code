

import java.util.Random;
import java.util.Scanner;


public class Game1 {
    public static void main(String[] args) {
 System.out.print("enter your life:");
Scanner sc =new Scanner(System.in);
int yourlife = sc.nextInt();

System.out.print("Enter attack:");
int yourattack =sc.nextInt();

System.out.print("Enter Defence:");
int yourdefence =sc.nextInt();

System.out.print("Enter  Your damage:");
int yourdamage =sc.nextInt();


System.out.print("Enter Monster Life:");
int monsterlife =sc.nextInt();

System.out.print("Enter Monster attack:");
int monsterattack =sc.nextInt();

System.out.print("Enter monster defence:");
int monsterdefence =sc.nextInt();

System.out.print("Enter Monster Damage:");
int monsterdamage=sc.nextInt(); 

Random generator = new Random();
do{
        boolean attacker = generator.nextBoolean();
        if(attacker){
        System.out.println("your attack");
        int dice =generator.nextInt(6) + 1 +generator.nextInt(6) +1 ;
        int attackvalue = yourattack + dice ;
        System.out.println("rolled value:" + dice);
        System.out.println("your attack value :" + attackvalue);
           if(attackvalue > monsterdefence) {
             System.out.println("attacke successful");
             monsterlife = monsterlife - yourdamage ; 
               System.out.println("Monster remaining life :" + monsterlife);
         } else
         {
             System.out.println("attack unsuccessful");
         }
        }
           else 
         {
          
                 System.out.println("Monster attack");
        int dice =generator.nextInt(6) + 1 +generator.nextInt(6) +1 ;
        int attackvalue = monsterattack + dice ;
        System.out.println("rolled value:" + dice);
        System.out.println("your  Monster attack value :" + attackvalue);
         if(attackvalue > monsterdefence) {
             System.out.println("attacke successful");
             yourlife = yourlife - monsterdamage ; 
               System.out.println("Monster remaining life :" + yourlife);
         } else
         {
             System.out.println("attack unsuccessful");
         }
        
         
  }   
}while(yourlife > 0 && monsterlife >0);
    }
}

   
