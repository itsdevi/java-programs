import java.util.Scanner;

public class linearsearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []arr ={2,5,7,1,6,9,3};
        int flag=0;
        System.out.println("Enter number to be searched: ");
        int key = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if(key== arr[i]){
                System.out.println("Found at index "+ i+1);
                flag=1;
                break;
            }
           
        }
        if(flag!=1){
            System.out.println("Not found");
        }
        
    }
}
