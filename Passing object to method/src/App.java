public class App {
      static void changeSpeed(Car c) {
        c.speed = 200;
    }

    public static void main(String[] args) {
        Car myCar = new Car("Toyota", 100);

        System.out.println("Before: " + myCar.speed);
        changeSpeed(myCar);
        System.out.println("After: " + myCar.speed);
    }
}
        
    