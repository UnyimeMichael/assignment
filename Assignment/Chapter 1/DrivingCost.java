import java.util.Scanner;

 public class DrivingCost{
 
  public static void main(String[] args){
  
   Scanner userInput = new Scanner(System.in);
   
    System.out.println("Enter milesDriven");
    
     double milesDriven = userInput.nextDouble();
     
      System.out.println("Enter milesPerGallon");
       
       double milesPerGallon = userInput.nextDouble();
        
        System.out.println("Enter pricePerGallon");
  
          double pricePerGallon = userInput.nextDouble();
          
           double costTotal = (milesDriven * pricePerGallon) / milesPerGallon;
           
            System.out.println("The cost of driving is $" + costTotal);
  
  }
 }
