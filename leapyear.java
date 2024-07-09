import java.util.*;
public class leapyear {
    public static void main(String args[]){
        int year;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter year:");
        year = sc.nextInt();
        if(((year%4==0)&& !( year % 100==0))||(year%400==0)){
            System.out.println("LEAP YEAR");

        }
        else{
            System.out.println("NOT LEAP YEAR");
        }
    }
}

// year= input("enter year")
// if(((year%4==0)&& !( year % 100==0))||(year%400==0)):
//     print("leap year")
// else:
//     print("not leap year")

