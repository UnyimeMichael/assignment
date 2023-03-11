import java.util.Scanner;

 public class ArithmeticIntegers{

  public static void main(String[] args){
  
    Scanner userInput = new Scanner(System.in);
    
     System.out.println("Enter Number1");
     
      int number1 = userInput.nextInt();
      
       System.out.println("Enter Number2");
       
        int number2 = userInput.nextInt();
        
         int number1Entered = number1 * number1;
          
          int number2Entered = number2 * number2;
          
           int sum = number1Entered + number2Entered;
            
            int difference = number1Entered - number2Entered;
          
           System.out.println("The square of each integers are " + number1Entered + " and " + number2Entered);
           
           System.out.println("The sum of their square is " + sum);
           
           System.out.println("The difference of their square is " + difference);
  }


}
