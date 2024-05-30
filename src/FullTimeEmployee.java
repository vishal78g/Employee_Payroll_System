public class FullTimeEmployee extends Employee{

    private double  salary;

    public FullTimeEmployee(int id, String name, double salary){
        super(id,name);
        this.salary=salary;
    }

    public double getSalary(){
        return salary;
    }

    public void setSalary(double salary){
        this.salary=salary;
    }

    public double calculateSalary(){
        return salary;
    }

    @Override
    public String toString() {
        return "Employee { ID : "+getId()+", Name : "+getName()+", Salary : "+getSalary()+" },";
    }
}
