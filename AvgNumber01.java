import java.util.*;
public class AvgNumber01 {
   public static void main (String[] args){
   
      Scanner src =  new Scanner(System.in);
      double a=0 , b = 0;
      
      while (b<3){
         System.out.print ("Please enter number: ");
         a+=src.nextDouble();
         b++;  
      }
      
      System.out.print("The average is: " + a/b);
   }
}
 
 
