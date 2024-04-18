import java.util.Scanner;
public class FrequencyOfCharacter {
    public static void main(String[] args) {
        System.out.println("Enter the string");
        int i,count=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the character whose frequency is to be found");
        String strg1= sc.next();
        
        char ch = sc.next().charAt(0);

        for(i=0;i<strg1.length();i++){
            if(ch==strg1.charAt(i))
            count++;
        }
        System.out.println("The frequency is "+count);

    }
}
