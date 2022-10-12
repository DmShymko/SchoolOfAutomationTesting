import java.util.ArrayList;
import java.util.List;

public class Company {
    static List<Employee> listEmployee =new ArrayList<>();

    public static void addEmployeeInList (Employee employee){
    listEmployee.add(employee);
    }

    public static void getAllEmployee (List l){
        System.out.println(listEmployee);

    }


}
