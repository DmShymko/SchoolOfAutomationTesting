public class Employee {

    String name;
    String surname;
    Double salary;

    Employee (String name, String surname, Double salary){
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public static void getAllData(){
        System.out.println("Salary for IMIE NAZWISKO is WYPLATA");
    }

    static Employee employee1 = new Employee("John","Smith",1500.00);
    static Employee employee2 = new Employee("Maria","Walt",2000.00);
    static Employee employee3 = new Employee("Samuel","Barclay",2500.00);

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }
}
