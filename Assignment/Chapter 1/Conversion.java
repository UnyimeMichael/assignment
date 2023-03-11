import java.util.Scanner;
 
  public class Conversion{
  
   public static void main(String[] args){
    
    Scanner userInput = new Scanner(System.in);
    
     System.out.println("Enter poundsNumber");
     
      double poundsNumber = userInput.nextDouble();
      
       double kg = poundsNumber * 0.454;
        
        System.out.println(poundsNumber + " pounds is " + kg + " kilograms ");
   
   }
   }
