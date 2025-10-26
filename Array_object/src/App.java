import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine(); 
        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for student " + (i + 1));
            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Marks: ");
            double marks = sc.nextDouble();
            sc.nextLine();
            students[i] = new Student(id, name, marks);
        }
        System.out.println("\n=== Student Result List ===");
        for (Student s : students) {
            s.display();
        }

        sc.close();
    }
    }
