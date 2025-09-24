public class App {
    public static void main(String[] args) throws Exception {
       // Creating objects using different constructors
        Book b1 = new Book();
        Book b2 = new Book("Java Basics", "James Gosling");
        Book b3 = new Book("Effective Java", "Joshua Bloch", 416);
        Book b4 = new Book("Clean Code", "Robert C. Martin", 464, 2500.0);

        b1.showBookDetails();
        b2.showBookDetails();
        b3.showBookDetails();
        b4.showBookDetails();
    }
}
