public class methodOverloading {
    public static void main(String[] args) {
        add(3,5);
        add(3,2,1);
        add(8,9,3,7);
        add(8.2,1.5);
    }
    static void add(int a, int b){
        int z= a+b;
        System.out.println(z);
    }
    static void add(int a, int b,int c){
        int z= a+b+c;
        System.out.println(z);
    }
    static void add(int a, int b, int c, int d){
        int z= a+b+c+d;
        System.out.println(z);
    }

    static void add(double a, double b){
        double z= a+b;
        System.out.println(z);
    }
}
