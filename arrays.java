import java.util.Scanner;
import java.util.ArrayList;

public class arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" 1 D array");
        String fruits[] = {"apple","orange","grapes"};

        for(int i=0;i<fruits.length;i++){
            System.out.println(fruits[i]);
        }

        System.out.println("2D array");

        String cars[][]= {
                            {"a","b","c"},
                            {"k","j","o"},
                            {"p","o","y"}
                        };
         
        // String [][] cars= new String[3][3]; 

        // for(int i=0;i<3;i++){
        //     for(int j=0;j<3;j++){
        //         cars[i][j]= sc.next();

        //     }
            
        // }

        for(int i=0;i<3;i++){
            System.out.println(" ");
            for(int j=0;j<3;j++){
              System.out.print(cars[i][j]+" ");
            }
            
        }

        System.out.println("\n \nARRAYLIST");
        ArrayList <String> food = new ArrayList<String>();
        food.add("pizza");
        food.add("burger");
        food.add("biriyani");
        food.add("porotta");


        food.set(0,"laddoo");   //replace value
        food.remove(food.size()-1);             //remove last value
        for(int i=0;i<food.size();i++){
            System.out.println(food.get(i));
        }

    }
}
