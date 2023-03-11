import java.util.Scanner;

 public class InterestRate{
 
  public static void main(String[] args){
  
   Scanner userInput = new Scanner(System.in);
    
    System.out.println("Enter balance");
    
     double balance = userInput.nextDouble();
     
      System.out.println("Enter percentageRate");
      
       double percentageRate = userInput.nextDouble();
      
        double interest = balance * (percentageRate / 1200);
       
         System.out.println("The interest rate is " + interest);
  }
 }
