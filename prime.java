import java.util.*;
public class q9_prime{
    public static void main(String[] args){
        int n,c=0;
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        for(int i=0; i<n; i++){
            if(i%5==0)
            c++;

        }
        if(c==1){
            System.out.println("Prime");
        }
        else
        System.out.println("NON PRime");

    }
}