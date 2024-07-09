import java.util.*;
public class attendance {
    public static void main(String args[]){
       int attendance,mark;
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter attendance percentage:");
       attendance= sc.nextInt();
       if ( attendance>90){
        mark=10;
       }
       else{
        mark= attendance/10;
       }
       System.out.println("Mark is "+ mark);

    }
    
}
