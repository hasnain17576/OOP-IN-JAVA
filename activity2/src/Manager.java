public class Manager {
    private String title;
    private double dues;
    private employeeRecord emp;
    private StudentRecord stu;

    public Manager(String t,double d,employeeRecord e,StudentRecord s) 
    {
        title=t;
        dues=d;
        emp=e;
        stu=s;
    }
    public void display(){
        System.out.println("TITLE is :"+ dues);
        System.out.println("Dues are"+dues);
        System.out.println("Employee record as under");
        System.out.println("Employee id "+emp.getEmp_id());
        System.out.println("Employee id is:"+emp.getSalary());
        System.out.println("Sudent record as under:");
        System.out.println("Degree is :"+stu.getDegree());
    }
    
}
