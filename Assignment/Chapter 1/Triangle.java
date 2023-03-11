import java.util.Scanner;
 
 public class Triangle{
 
  public static void main(String[] args){
  
   Scanner userInput = new Scanner(System.in);
   
    System.out.println("Enter side1");
    
     double side1 = userInput.nextDouble();
     
      System.out.println("Enter side2");
       
       double side2 = userInput.nextDouble();
       
        System.out.println("Enter side3");
         
         double side3 = userInput.nextDouble();
         
          double s = (side1 + side2 + side3) / 2;
          
           double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
            
            System.out.println("The area of the triangle " + area);
  
  
}
 
 
 
 }
