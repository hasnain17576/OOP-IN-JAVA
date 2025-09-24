public class App {
    public static void main(String[] args) throws Exception {
        Employee e1 = new Employee();
        e1.name = "hasnian";
        e1.salary = 12344;
        e1.grade = 4;

        e1.show_information();   // pehle values print hongi
        e1.increaseSalary(54362541); // salary increase hogi aur print hoga
        e1.changeGrade(8);           // grade change hoga aur print hoga
        e1.show_information();   // updated values print hongi
    }
}
