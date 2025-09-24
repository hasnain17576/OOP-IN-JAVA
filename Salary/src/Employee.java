public class Employee {
    public String name;
    public double salary;
    public int grade;

    public void show_information() {
        System.out.println(name);
        System.out.println(salary);
        System.out.println(grade);
    }

    public void increaseSalary(double amount) {
        salary = salary + amount;
        System.out.println(salary);
    }

    public void changeGrade(int g) {
        grade = g;
        System.out.println(grade);
    }
}
