import java.util.Scanner;

 public class Integers{
 
  public static void main(String[] args){
  
   Scanner userInput = new Scanner(System.in);
   
    System.out.println("Enter evenNumber1");
    
     int evenNumber1 = userInput.nextInt();
     
      System.out.println("Enter evenNumber2");
      
       int evenNumber2 = userInput.nextInt();
       
        System.out.println("Enter oddNumber1");
         
         int oddNumber1 = userInput.nextInt();
         
          System.out.println("Enter oddNumber2");
          
           int oddNumber2 = userInput.nextInt();
           
            int e = evenNumber1 + evenNumber2;
            
             int o = oddNumber1 + oddNumber2;
              
              int s = e + o;
             
              System.out.println("The sum of even integers " + e + " and odd integers " + o + " Is " + s);
            
  }
 
 }
