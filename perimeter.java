import java.util.*;
public class q2_ap{
    public static void main(String[] args){
        float l,b;
        System.out.println("Enter length and Breadth:");
        Scanner sc = new Scanner(System.in);
        l=sc.nextFloat();
        b=sc.nextFloat();
        float peri=2*(l+b);
        float area=l*b;
        System.out.println("Perimeter: " + peri);
        System.out.println("Area: " + area);
        
    }
}
    
