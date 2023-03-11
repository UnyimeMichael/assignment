import java.util.Scanner;

 public class RunwayLenght{
 
  public static void main(String[] args){
  
   Scanner userInput = new Scanner(System.in);
   
    System.out.println("Enter speedV");
  
      double speedV = userInput.nextDouble();
      
       System.out.println("Enter accelerationA");
       
        double accelerationA = userInput.nextDouble();
        
         double lenght = (speedV * speedV) / (2 * accelerationA);
         
          System.out.println("The minimum runway lenght is " + lenght);
  }
 }
