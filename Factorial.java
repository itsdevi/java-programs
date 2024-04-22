import java.util.*;
class Recursive {
    int Factorials(int n){
        if(n==0)
            return 1;
        else
            return (n*Factorials(n-1));
    }
}
class Factorial{
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        Recursive f = new Recursive();
        System.out.println("Enter a number");
        n= sc.nextInt();
        int result= f.Factorials(n);
        System.out.println("Factorial is "+ result); 
    }
}