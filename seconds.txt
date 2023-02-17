import java.util.*;
public class q6_secs{
    public static void main(String[] args){
        int h,m, s;
        Scanner sc = new Scanner(System.in);
        h=sc.nextInt();
        m=sc.nextInt();
        s=sc.nextInt();
        int totalSeconds = (h * 60 * 60) + (m * 60) + s;
        System.out.println("Total Seconds: " + totalSeconds);
    
    
    }
}