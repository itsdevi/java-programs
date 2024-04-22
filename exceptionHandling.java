import java.util.*;
public class exceptionHandling {
    public static float read(int a[],int n)throws ArithmeticException{
        Scanner sc = new Scanner(System.in);
        float sum=0;
        if(n<5){
            throw new ArithmeticException("Size less than 5");
        }
        else{
            System.out.println("Enter elements: ");
            
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
                sum+=a[i];
            }
        }
        return(sum/n);
    }
        
    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Ente number of elements: ");
        int n = sc.nextInt();
        int a[]=  new int[n];
        try{
            float avg = read(a,n);
            System.out.println("Average = "+ avg);
        }
        catch(ArithmeticException e){
            System.out.println("Size should not be less than 5");
        }
        catch(Exception f){
            System.out.println("Some error occured!");

        }
        finally{
            System.out.println("Program executed!");
        }
    }
}
