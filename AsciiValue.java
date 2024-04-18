import java.util.Scanner;
public class AsciiValue {
    public static void main(String[] args) {
        System.out.println("Enter a character");
        Scanner sc= new Scanner(System.in);
        char c= sc.next().charAt(0);
        int ch = (int)c;
        System.out.println("ASCII value of "+ c +" is "+ ch);
    }
    
}
