abstract class Employee
{
    String name;
    int employeeId;

    public Employee(String name, int employeeId)
    {
        this.name = name;
        this.employeeId = employeeId; 

    }

    abstract void calculateSalary();

    public void showDetails()
    {
        System.out.println("Employee ID: "+employeeId);
        System.out.println("Name: "+name);
    }

}

class FullTimeEmployee extends Employee
{
    int salary = 50000;
    public FullTimeEmployee(String name, int employeeId)
    {
        super(name, employeeId);
    }

    void calculateSalary()
    {
        showDetails();
        System.out.println("Salary: $" + salary);
        System.out.println();

    }

}

class PartTimeEmployee extends Employee
{
    int hoursworked;
    private final int ratePerHour = 500;

    public PartTimeEmployee(String name, int employeeId, int hoursworked)
    {
        super(name, employeeId);
        this.hoursworked = hoursworked;
    }

    void calculateSalary()
    {
        int salary = hoursworked * ratePerHour;
        showDetails();
        System.out.println("Salary: $"+ salary);
        System.out.println();
    }
}
    public class EmployeeDetails
    {
        public static void main(String[] args) {
            FullTimeEmployee emp1 = new FullTimeEmployee("Abhi", 101);
            PartTimeEmployee emp2 = new PartTimeEmployee("Venu ", 102, 20);
        
              emp1.calculateSalary();
              emp2.calculateSalary();   
        }

}