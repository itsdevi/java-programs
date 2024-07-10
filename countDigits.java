import java.util.*;
import java.lang.Math;
public class countDigits {
    public static void main(String[] args) {
        int num,n,count=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        num = sc.nextInt();
        if(num==1){
            System.out.println("1");
        }
        else{
            if(num<0){                  //negative number
                 num = Math.abs(num);
            }
        while(num>0){
            n=num%10;
            num=num/10;
            if(n>0){
                count++;
            }
            
        }
    
        System.out.println(count);
    }
    }
}
