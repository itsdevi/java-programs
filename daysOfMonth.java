import java.util.*;
import java.util.Scanner;
public class daysofmonth {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String month;
        int year;
        System.out.println("enter month:");
        month = sc.nextLine();
        switch(month){
            case "january":
            case "march":
            case "may":
            case "july":
            case "august":
            case "october":
            case "december": System.out.println("31 days");
                                break;
            case "april":
            case "june":
            case "september":
            case "november": System.out.println("30 Days");
                            break;
            case "february": System.out.println("Enter year");
                             year = sc.nextInt();
                            if(((year%4==0)&& !( year % 100==0))||(year%400==0)){
                                System.out.println("29 Days");
                            }
                            else{
                                System.out.println("28 Days");
                            }
                            break;
        }
    }
}
