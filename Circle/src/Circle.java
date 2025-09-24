public class Circle {
    public double radius; // predefined data type

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Getter
    public double getRadius() {
        return radius;
    }

    // Setter
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Method: area calculate
    public double getArea() {
        return 3.14159 * radius * radius;
    }
}

