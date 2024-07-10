import java.util.Scanner;

public class methods {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String name= sc.nextLine();
        cat(name);

        int a=4,b=9;
        int ans = add(a,b);
        System.out.println(ans);
    }
    static void cat(String name){
        System.out.println(name +" says meow");
    }
    static int add(int x,int y){
        int z=x+y;
        return z;
    }
}
