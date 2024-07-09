import java.util.*;
public class sumofNnumbers {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        long n,sum=0;
        System.out.println("enter number:");
        n=sc.nextLong();
        for (int i=0;i<=n;i++){
                sum+=i;
        }
        System.out.println("sum of "+ n+" numbers is "+sum);

    }
    
}
