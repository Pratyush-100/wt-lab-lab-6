import java.util.*;
public class q3_fact{
    public static void main(String[] args){
        int n,fact=1;
         Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        for(int i=n;i>0;i--){
            fact=fact*i;
        }
        System.out.println("Factorial: " + fact);
    
    }
}