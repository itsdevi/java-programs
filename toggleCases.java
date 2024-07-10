import java.util.*;
public class toggleCases {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = "AB*&cRt";
        StringBuilder res = new StringBuilder("");
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if(ch>='A'&& ch <='Z'){
               res.append((char) (ch+32));
            }
            else if(ch>='a'&& ch<='z'){
                res.append((char) (ch-32));
            }
            else{
                res.append(ch);
            }
        }
        String ans = res.toString();
        System.out.println(ans);
    }
}
