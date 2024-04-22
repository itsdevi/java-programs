import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
class fileHandling {
    public static void main(String[] args) {
        try{
            FileInputStream obj1 = new FileInputStream("file1.txt"); //open textfile as input
            FileOutputStream obj2 =new FileOutputStream("file2.txt"); //open textfile as outout
            int i;
            while((i=obj1.read())!=-1)
                obj2.write(i);
            System.out.println("File written successfully");
            obj1.close();
            obj2.close();
        }
        catch(FileNotFoundException e){
            System.out.println("File not found!!");

        }
        catch(IOException f){
            System.out.println("Error occured!!");
        }
    }
}
