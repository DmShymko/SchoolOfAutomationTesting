import java.util.Scanner;

public class Menu {

    public static void rullesMenu() {
        System.out.println("Option 1 – View the sum of all employees salary");
        System.out.println("Option 2 - View details of all employees");
        System.out.println("Option 3 – Add another employee");
        System.out.println("Option 4 – End of program operation");

    }

    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        rullesMenu();
        switch (scanner.nextInt()) {
            case 1:
                System.out.println(Employee.getMeSumSalary());
                menu();
                break;
            case 2:
                Company.getAllEmployee(Company.listEmployee);
                menu();
                break;
            case 3:
                int a = 1;
                a += (Company.listEmployee.size());
                System.out.println("Entered date employee #" + a);
                System.out.println("Enter Name, Surname, salary");
                Company.listEmployee.add(new Employee(scanner.next(), scanner.next(), scanner.nextDouble()));
                menu();
                break;
            case 4:
                System.out.println("You have chosen to terminate the program");
                System.out.println("See you later.");
                break;


        }
    }

}
