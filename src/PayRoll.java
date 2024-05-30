import java.util.ArrayList;

public class PayRoll {
    private ArrayList<Employee> employeesList;

    public PayRoll(){
        employeesList= new ArrayList<>();
    }

    public void addEmployee(Employee employee){
        employeesList.add(employee);
    }

    public void displayList(){
        for (Employee employee : employeesList) {
            System.out.print(employee.toString());
        }
        System.out.println("\b");
    }

}
