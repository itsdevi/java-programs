import java.util.*;

public class fibonacci{
    public static void main(String args[]){
    int a=0,b=1;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number:");
    int n = sc.nextInt();
    System.out.println("Fibonacci numbers at "+n+"th position :");
    // System.out.println(a);
    // System.out.println(b);
    int c=1;
    for(int i=2;i<n;i++){
        // System.out.println(c);
        a=b;
        b=c;
        c=b+a;
    }
    System.out.println(c);

    }

}