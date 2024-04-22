import java.util.Scanner;
class Employee{
    String name;
    int age;
    long phone;
    String address;
    double salary;
    void get_details(String name, int age, long number, String add, double salary){
        this.name=name;
        this.age=age;
        phone=number;
        address= add;
        this.salary=salary;

    }
    void print_details(){
        System.out.println(name +"\n"+ age +"\n"+ phone +"\n"+ address);

    }
    void print_salary(){
        System.out.println(" Salary of employee is :"+ salary);
    }
}
class Officer extends Employee{
    Scanner sc = new Scanner(System.in);
    String sp;
    void read(){
        sp=sc.next();
    }
}
class Manager extends Employee{
    Scanner sc = new Scanner(System.in);
    String dept;
    void read(){
        dept = sc.next();
    }
}
class InheritanceExample{
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Officer o1 = new Officer();
        Manager m1 = new Manager();
        e1.get_details("Peter", 27, 132456, "kochi india", 17000);
        System.out.println("Enter specialisation of officer:");
        o1.read();
        System.out.println("Display details of officers:");
        e1.print_details();
        e1.print_salary();
        System.out.println("Specialization: "+o1.sp);
        e2.get_details("dave", 23, 97986738,"chennai,india", 24000);
        System.out.println("Enter department of manager: ");
        m1.read();
        System.out.println("Display details of manager: ");
        e2.print_details();
        e2.print_salary();
        System.out.println("Department :"+ m1.dept);
        
    }
}