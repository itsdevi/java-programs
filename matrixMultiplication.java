import java.util.Scanner;
public class matrixMultiplication {
    public static void main(String[] args) {
        System.out.println("Enter number of rows and columns of 1st matrix:");
        Scanner sc= new Scanner(System.in);
        int m1 = sc.nextInt();
        int n1 = sc.nextInt();
        System.out.println("Enter the elements");
        int i,j;
        int[][] matrix1 = new int [10][10];
        for(i=0;i<m1;i++){
            for(j=0;j<n1;j++){
                matrix1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter number of rows and columns of 2nd matrix:");
        int m2 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println("Enter the elements");
        int[][] matrix2 = new int [10][10];
        for(i=0;i<m2;i++){
            for(j=0;j<n2;j++){
                matrix2[i][j]=sc.nextInt();
            }
        }
       System.out.println("1ST Matrix");
       for(i=0;i<m1;i++){
        for(j=0;j<n1;j++){
            System.out.print(matrix1[i][j]+"\t");
        }
        System.out.println();
       } 
       System.out.println("2ND Matrix");
       for(i=0;i<m2;i++){
        for(j=0;j<n2;j++){
            System.out.print(matrix2[i][j]+"\t");
        }
        System.out.println();
       }
       if(n1==m2){
        int[][] matrix3= new int[10][10];
        System.out.println("Product Matrix:");
        for(i=0;i<m1;i++){
            for(j=0;j<n2;j++){
                matrix3[i][j]=0;
                for(int k=0;k<n1;k++){
                    matrix3[i][j]=matrix3[i][j]+matrix1[i][k]*matrix2[k][j];
                }
            }
        }
        for(i=0;i<m1;i++){
            for(j=0;j<n2;j++){
                System.out.print(matrix3[i][j]+"\t");
            }
            System.out.println();
        }
       }
    }
}
