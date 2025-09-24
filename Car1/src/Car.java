public class Car {
       // Attributes
    String brand;
    String model;
    int year;
    double price;

    // Constructor 1: No-argument
    Car() {
        brand = "Unknown";
        model = "Not specified";
        year = 2000;
        price = 0.0;
    }

    // Constructor 2: Two parameters
    Car(String b, String m) {
        brand = b;
        model = m;
        year = 2024;    // default year
        price = 20000;  // default price
    }

    // Constructor 3: Three parameters
    Car(String b, String m, int y) {
        brand = b;
        model = m;
        year = y;
        price = 25000;  // default price
    }

    // Constructor 4: Four parameters
    Car(String b, String m, int y, double p) {
        brand = b;
        model = m;
        year = y;
        price = p;
    }

    // Behavior
    void showCarDetails() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Year: " + year + ", Price: " + price);
    
    }
}
