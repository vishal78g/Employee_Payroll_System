public class PartTimeEmployee extends Employee{

    private int hoursWorked;
    private double ratePerHour;

    public PartTimeEmployee(int id, String name, int hoursWorked, double ratePerHour) {
        super(id, name);
        this.hoursWorked = hoursWorked;
        this.ratePerHour = ratePerHour;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getRatePerHour() {
        return ratePerHour;
    }

    public void setRatePerHour(double ratePerHour) {
        this.ratePerHour = ratePerHour;
    }

    public double calculateSalary(){
        return hoursWorked*ratePerHour;
    }

    @Override
    public String toString() {
        return "Employee { ID : "+getId()+", Name : "+getName()+", Salary : "+getRatePerHour()
                +", Hours Worked : " +getHoursWorked()+" },";
    }
}
