import java.util.Scanner;
 
 public class MassIndex{
  
  public static void main(String[] args){

  Scanner userInput = new Scanner(System.in);
  
   System.out.println("Enter poundsNumber");
   
    double poundsNumber = userInput.nextDouble();
     
     System.out.println("Enter metersNumber");
      
      double meterNumber = userInput.nextDouble();
      
       double kilograms = poundsNumber * 0.45359237;
      
        double inches = meterNumber * 0.0254;
        
         double bmi = kilograms / (inches * inches);
         
          System.out.println("BMI is " + bmi); 
     
     
 
 
 
 
 
 }
 
 }
