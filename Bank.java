import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.*;
public class Bank
{
   public static BankSomething lmao; //hello
   //idk what to comment so yay!! comment !!
 
   public static void showMenu()
   {
      Scanner input = new Scanner(System.in);
      System.out.println("Welcome");
      System.out.println("Please select what you wish to do today, please input the number corresponding to what you wanna do!");
      System.out.println("1.Display account information");
      System.out.println("2.Deposit Money");
      System.out.println("3.Withdraw Money");
      System.out.println("4. Exit");
      int x;
      x = input.nextInt();
      while (x < 1 || x > 4)
      {System.out.println("please enter a valid amount");
         x = input.nextInt(); } 
      if( x == 1) 
      {
         wa();
      }
      else if (x == 2)
      {
      wah();
      }
      else if (x == 3)
      {
      wahh();
      }
      else if (x == 4)
      {
      wahhh();
      }
   
   }
   public static void main(String args[])
   {
      Scanner input = new Scanner(System.in);
      String ja;
      double amount;
      System.out.println("Welcome to the Bank lab!");
      ja = JOptionPane.showInputDialog(null, "Please enter your name", "Bank lab", JOptionPane.QUESTION_MESSAGE);
      System.out.println("please enter your starting ammount");
      amount = input.nextDouble();
      while( amount < 0)
      {System.out.println("please enter a valid amount");
         amount = input.nextDouble();}
    lmao = new BankSomething(ja, amount);
      showMenu();
   }
      
   public static void wa()
   {   
   Scanner input = new Scanner(System.in);
         System.out.println(lmao.finali());
   showMenu();}

   public static void wah()
   {
   Scanner input = new Scanner(System.in);
      System.out.println("please enter the amount of deposit");
      double loi;
      loi = input.nextDouble(); 
      lmao.Deposit(loi);
        showMenu();
               
      
   }
   public static void wahh()
   {
   Scanner input = new Scanner(System.in);
      System.out.println("please enter the amount of Withdraw");
      double lo;
      lo = input.nextDouble();
      lmao.withdraw(lo);
        showMenu();
              
   }
   public static void  wahhh()
   {
      System.out.println("Have a nice day!");
        
        
        
   }
             
}





