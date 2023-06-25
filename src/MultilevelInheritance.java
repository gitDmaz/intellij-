class User{
    int id;
    String name;
    int x = 10;
    public User(int id,String name){
        super(); // Will call parent class default constructor
        this.id = id;
        this.name = name;
    }
    public void display(int id, String name){
        System.out.print(" Id - " + this.id + " Name - " +this.name);
    }
}
class Person extends User{
    int salary;
    int x = 30;
    Person(int id, String name,int salary) {
        super(id, name); // Invoke immediately parent class parameterised constructor
        this.salary=salary;
    }
    public void display() {
        int x = 20;
        super.display(id,name);
        System.out.println(" Salary is - " + salary);
//        System.out.println("Local Variable value - " + x);
//        System.out.println("Child class Variable value - " + this.x);
//        System.out.println("Parent class variable value - " + super.x);
    }
}
class Emp extends Person{
    String companyName;
    Emp(int id, String name, int salary, String companyName) {
        super(id, name, salary);
        this.companyName = companyName;
    }
    public void display(){
        super.display();
        System.out.println("Company name is - " +companyName);

    }
}
public class MultilevelInheritance {
    public static void main(String[] args) {
        Emp p = new Emp(101,"Shraboni Sinha",10000,"TCS");
        p.display();

    }
}
