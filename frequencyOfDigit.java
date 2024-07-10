import java.util.*;
public class frequencyOfDigit {
    public static void main(String args[]){
        int num,n,key,count=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        num = sc.nextInt();
        System.out.println("enter number whose frequency is to be found");
        key = sc.nextInt();
        if(num<0){                  //negative number
            num = Math.abs(num);
        }
        while(num>0){
             n=num%10;
             num=num/10;
             if(key==n){
                count++;
            }
       
         }

        System.out.println("frequency of "+key+" is "+count);


    }
    
}
