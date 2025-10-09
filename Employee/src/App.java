public class App {
    public static void main(String[] args) throws Exception {
        Employee e1 = new Employee(101, "Ali", 50000);
        Employee e2 = new Employee(102, "Sara", 60000);
        Employee e3 = new Employee(103, "Ahmed", 55000);
        e2.setSalary(65000);
        e1.displayInfo();
        e2.displayInfo();
        e3.displayInfo();
        System.out.println("All employees belong to company: " + Employee.companyName);
    }
}

