public class App {
    public static void main(String[] args) throws Exception {
               // Jab object banta hai, constructor automatically call hota hai
        Student s1 = new Student("Ali", 20);
        Student s2 = new Student("Hasnain", 22);

        s1.showInfo();  // Output: Name: Ali, Age: 20
        s2.showInfo();  // Output: Name: Hasnain, Age: 22
    }
}
