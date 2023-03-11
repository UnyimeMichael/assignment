import java.util.Scanner;

 public class Energy{
 
  public static void main(String[] args){
   
   Scanner userInput = new Scanner(System.in);
    
    System.out.println("Enter waterPerKg");
    
     double waterPerKg = userInput.nextDouble();
     
      System.out.println("Enter initialTemperature");
       
       double initialTemperature = userInput.nextDouble();
       
        System.out.println("Enter finalTemperature");
         
         double finalTemperature = userInput.nextDouble();
         
          double m = waterPerKg;
            
            double energy = m * (finalTemperature - initialTemperature) * 4184;
            
              System.out.println("The Energy needed is " + energy);
  
  
  }
 
 }
