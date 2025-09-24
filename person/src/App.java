public class App {
    public static void main(String[] args) throws Exception {
        person p1 = new person();

        // predefined data types ko use karke values set kar rahe hain
        p1.name = "Ali";
        p1.age = 22;
        p1.height = 5.9;

        // method call
        p1.displayInfo();
    }
}
