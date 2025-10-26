
    import java.util.Scanner;

// ✅ Step 1: Define Student Class
class Student {
    int id;
    String name;
    double marks;

    // Constructor — object create karte waqt data initialize karta hai
    Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    // Method to display student details
    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);

        // Conditional logic — result check
        if (marks >= 50)
            System.out.println("Result: Pass ✅");
        else
            System.out.println("Result: Fail ❌");

        System.out.println("----------------------------");
    }
}

    

