public class Employee {
    private int empID;
    private String name;
    private double salary;

    static String companyName = "TechNova Solutions";

    public Employee(int empID, String name, double salary) {
        this.empID = empID;
        this.name = name;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid salary amount!");
        }
    }
    public void displayInfo() {
        System.out.println("Employee ID: " + empID);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Company: " + companyName);
        System.out.println("-------------------------");
    }
}

    
