import java.util.*;
public class q4_quada{
    public static void main(String[] args){
         double a , b,c;
         Scanner sc = new Scanner(System.in);
        a=sc.nextInt(); 
        b=sc.nextInt(); 
        c=sc.nextInt(); 
      double dis = b*b - 4*a*c; 
      double r1 = (-b + Math.sqrt(dis))/(2*a); 
      double r2 = (-b - Math.sqrt(dis))/(2*a); 
      System.out.println("Root 1 = " + r1); 
      System.out.println("Root 2 = " + r2); 
    }
}
