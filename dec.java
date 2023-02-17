import java.util.*;
public class q7_dec{
    public static void main(String[] args){
        int decimal;
        int binary[] = new int[8];
        int index = 0;
        Scanner sc=new Scanner(System.in);
        decimal=sc.nextInt();
        
        while (decimal > 0) {
            binary[index++] = decimal % 2;
            decimal = decimal / 2;
        }
        
        for (int i = 7; i >= 0; i--) {
            System.out.print(binary[i]);
        }
        
        System.out.println();

    }
}