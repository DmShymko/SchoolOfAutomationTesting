import java.util.InputMismatchException;
import java.util.Scanner;

public class Employee {

    String name;
    String surname;
    Double salary;

    Employee(String name, String surname, Double salary) {

        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    public Double getSalary() {
        return salary;
    }

    public static void getAllData(Employee employee) {
        System.out.println("Salary for " + employee.name + " " + employee.surname + " is: " + employee.salary);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }

    public static void createEmployee() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Create 5 Employee, Enter Name, Surname, and salary");


        for (int i = 0; i < 5; i++) {
            try {
                System.out.println("Enter data employee #" + (i + 1));

                Employee employee = new Employee(scanner.next(), scanner.next(), scanner.nextDouble());

                Company.listEmployee.add(employee);
            } catch (InputMismatchException e) {
                System.err.println("You entered invalid data salary, please input number salary");
                i--;
            }

        }
    }

    public static double getMeSumSalary() {
        double salary = 0;
        for (int i = 0; i < Company.listEmployee.size(); i++) {
            salary += Company.listEmployee.get(i).getSalary();

        }
        return salary;
    }
}
