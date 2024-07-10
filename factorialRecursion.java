import java.util.*;
public class factorialRecursion {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        num = sc.nextInt();
        int sum = fact(num);
        System.out.println("sum:"+sum);

    }


public static int fact(int n){
    if(n<=1){
        return 1;
    }
    return n*fact(n-1);
}
}


