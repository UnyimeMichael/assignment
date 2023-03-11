import java.util.Scanner;
  
 public class MeterConversion{
 
  public static void main(String[] args){
  
   Scanner userInput = new Scanner(System.in);
   
    System.out.println("Enter feetNumber");
    
     double feetNumber = userInput.nextDouble();
      
      double meters = feetNumber * 0.305;
      
       System.out.println(feetNumber + " feet is " + meters + " meters ");
       
   
  
  
  }
 }
