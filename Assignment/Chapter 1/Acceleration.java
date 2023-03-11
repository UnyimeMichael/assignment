import java.util.Scanner;
 
 public class Acceleration{
 
  public static void main(String[] args){
  
   Scanner userInput = new Scanner(System.in);
   
    System.out.println("Enter v0");
    
     double v0 = userInput.nextDouble();
     
      System.out.println("Enter v1");
       
       double v1 = userInput.nextDouble();
       
        System.out.println("Enter t");
         
         double t = userInput.nextDouble();
         
          double a = (v1 - v0) / t;
          
           System.out.println(" The average acceleration is " + a);
   
   
  
  
  
  
 }
 
 
 
 
 }
