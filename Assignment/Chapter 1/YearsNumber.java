import java.util.Scanner;

 public class YearsNumber{
  
  public static void main(String[] args){
  
   Scanner userInput = new Scanner(System.in);
   
    System.out.println("Enter minutes");
    
     long minutes = userInput.nextLong();
     
      long m = (60 * 24 * 365);
       
       long y = minutes / m;
      
        double remainder = (minutes%m) / 1440;
      
       System.out.println(minutes + " minutes is approximately " + y + " years and " + remainder + " days ");
  
 }
 
 
 }
