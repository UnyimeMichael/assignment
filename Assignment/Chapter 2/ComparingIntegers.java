import java.util.Scanner;

 public class ComparingIntegers{
 
  public static void main(String[] args){
  
   Scanner userInput = new Scanner(System.in);
   
    System.out.println("Enter Number");
    
     int number = userInput.nextInt();
     
      int numberEntered = number * number;
      
       if(number > 100){
       System.out.printf("%d > %d%n " , number, 100);
       }
        
        if(number == 100){
        System.out.printf("%d == %d%n " , number , 100);
        }
        
        if(number != 100){
        System.out.printf("%d != %d%n " , number , 100);
        }
        
        if(number < 100){
        System.out.printf("%d < %d%n " , number ,100);
        }
        
        if(numberEntered > 100){
        System.out.printf("%d > %d%n " , numberEntered , 100);
        }
        
        if(numberEntered == 100){
        System.out.printf("%d == %d%n " , numberEntered , 100);
        }
        
        if(numberEntered != 100){
        System.out.printf("%d != %d%n " , numberEntered , 100);
        }
        
        if(numberEntered < 100){
        System.out.printf("%d < %d%n " , numberEntered , 100);
        }
  }
 
 
 }
