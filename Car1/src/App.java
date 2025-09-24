public class App {
    public static void main(String[] args) throws Exception {
         // Different constructors in action
        Car c1 = new Car(); // no-arg constructor
        Car c2 = new Car("Toyota", "Corolla"); // 2-arg constructor
        Car c3 = new Car("Honda", "Civic", 2023); // 3-arg constructor
        Car c4 = new Car("Tesla", "Model S", 2024, 79999.99); // 4-arg constructor

        c1.showCarDetails();
        c2.showCarDetails();
        c3.showCarDetails();
        c4.showCarDetails();
    }
}
