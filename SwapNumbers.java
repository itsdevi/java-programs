import java.util.Scanner;
public class SwapNumbers {
    public static void main(String[] args) {
        System.out.println("Enter two numbers to be swapped");
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int temp=0;
        System.out.println("Before swapping : \n a = "+a+"\n b = "+b);
        temp=a;
        a=b;
        b=temp;
        System.out.println("After swapping : \n a = "+a+"\n b = "+b);

    }
}
