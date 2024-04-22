import java.util.*;
abstract class shape{
    abstract void no_of_shapes();

}
class rectangle extends shape{
    void no_of_shapes(){
        System.out.println("number of sides: 4");
    }
}
class triangle extends shape{
    void no_of_shapes(){
        System.out.println(" number of sides: 3");
    }
}
class hexagon extends shape{
    void no_of_shapes(){
        System.out.println("Number of sides: 6");

    }
}
public class abstractClass {
    public static void main(String[] args) {
        rectangle r1= new rectangle();
        triangle t1 = new triangle();
        hexagon h1 = new hexagon();
        r1.no_of_shapes();
        t1.no_of_shapes();
        h1.no_of_shapes();
    }
}
