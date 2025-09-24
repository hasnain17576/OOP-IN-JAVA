public class App {
    public static void main(String[] args) {
        Circle c1 = new Circle(5.0);  // predefined double ka use

        // Getter se radius read
        System.out.println("Radius: " + c1.getRadius());

        // Area calculate
        System.out.println("Area: " + c1.getArea());

        // Setter se radius change
        c1.setRadius(7.5);

        System.out.println("New Radius: " + c1.getRadius());
        System.out.println("New Area: " + c1.getArea());
    }
}