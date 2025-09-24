public class Book {
    // Attributes (object variables)
    String title;
    String author;
    int pages;
    double price;

    // Constructor 1: No-argument constructor
    Book() {
        title = "Unknown";
        author = "Unknown";
        pages = 0;
        price = 0.0;
    }

    // Constructor 2: Constructor with 2 parameters
    Book(String t, String a) {
        title = t;
        author = a;
        pages = 100;     // default pages
        price = 500.0;   // default price
    }

    // Constructor 3: Constructor with 3 parameters
    Book(String t, String a, int p) {
        title = t;
        author = a;
        pages = p;
        price = 1000.0;  // default price
    }

    // Constructor 4: Full constructor
    Book(String t, String a, int p, double pr) {
        title = t;
        author = a;
        pages = p;
        price = pr;
    }

    // Behavior (method)
    void showBookDetails() {
        System.out.println("Title: " + title + ", Author: " + author +
                           ", Pages: " + pages + ", Price: " + price);
    
}

}