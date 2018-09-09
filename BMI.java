import java.util.*;
public class BMI {
   public static void main (String[] args){
   
      Scanner src = new Scanner(System.in);
      System.out.println( "Please enter BMI or -1 to end _");
      
      
      double a;
      a= src.nextDouble();

      while (a!= -1){
               
         double BMI= a;
            
         if (BMI < 18.5) { 
            System.out.println ("Patient is Underweight");
         }
         else if (BMI <= 25){
            System.out.println ("Patient is Normal Weight");
         }
         else if (BMI <= 30){
            System.out.println ("Patient is Over Weight");
         }
         else if (30 < BMI){
            System.out.println ("Patient is Obese");
         } 
         System.out.println( "Please enter BMI or -1 to end _");
         a= src.nextDouble();


      }
   }
}