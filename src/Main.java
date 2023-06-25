import java.util.Arrays;
import java.util.Scanner;

class Employee{
    int empId;
    String empName;
    float salary;

    public Employee(int empId, String empName, float salary){
        this.empId = empId;
        this.empName=empName;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", salary=" + salary +
                '}';
    }
}

class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many Account you want to create ? ");
        int size = scanner.nextInt();

        Employee[] emparr = new Employee[size];

        System.out.println("Enter " + size + " Number of account details : ");
        for (int i = 0; i<size; i++){
            System.out.println("Enter " + i + " no of Record");
            System.out.println("Enter Employee Id : ");
            int id = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Enter Employee name : ");
            String name = scanner.nextLine();

            System.out.println("Enter employee salary : ");
            float salary = scanner.nextFloat();

            Employee empobj = new Employee(id,name,salary);
            emparr[i] = empobj;
            System.out.println("====================================================");
        }

        System.out.println(Arrays.toString(emparr));
    }
}