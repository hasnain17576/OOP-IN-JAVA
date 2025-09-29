public class App {
    public static void main(String[] args) throws Exception {
        StudentRecord s=new StudentRecord();
        s.setDegree("MBA");
        employeeRecord e= new employeeRecord();
        e.setEmp_id(2);
        e.setSalary(250000);
        Manager m1=new Manager("financeManager",5000,e,s);
        m1.display();

    }
}
