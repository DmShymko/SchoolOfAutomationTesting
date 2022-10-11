

public class Main {
    public static void main(String[] args) {
       Company.listEmployee.add(Employee.employee1);
       Company.listEmployee.add(Employee.employee2);
       Company.listEmployee.add(Employee.employee3);


       Employee emp1 = Company.listEmployee.get(0);
       Employee emp2 = Company.listEmployee.get(1);
       Employee emp3 = Company.listEmployee.get(2);

        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);


    }

}
