import java.util.*;
public class VowelsConsonants {
    public static boolean isvowel(char ch){
        if(ch =='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String str = sc.nextLine();
        int vow=0, con=0;
        for(int i =0;i<str.length();i++){
            char ch = str.charAt(i);
            if(isvowel(ch)){
                vow++;
            }
            if(ch>='a'&& ch<='z' && (!isvowel(ch))){
                con++;
            }
        }
        System.out.println("vowels "+ vow);
        System.out.println("cononants "+ con);
    }
}
