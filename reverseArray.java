import java.util.Scanner;

public class reverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []arr = {2,5,3,1,8,0};
        int i=0,temp=0;
        int j= arr.length-1;
        while(i<j){

            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;

        }

        for(int k=0;k<arr.length;k++) {
            System.out.print(" "+arr[k]);
        }

    }
}
