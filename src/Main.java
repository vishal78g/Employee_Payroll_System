public class Main {
    public static void main(String[] args) {
        PayRoll list= new PayRoll();
        FullTimeEmployee emp1=new FullTimeEmployee(101,"Vishal",78000.0);
        PartTimeEmployee emp2= new PartTimeEmployee(102,"Rohit",80,450);

        list.addEmployee(emp1);
        list.addEmployee(emp2);

        list.displayList();

    }
}