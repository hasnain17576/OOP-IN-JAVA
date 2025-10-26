public class App {
    public static void main(String[] args) throws Exception {
           Point p1 = new Point(1, 2);
        Point p2 = new Point(4, 6);
        
        Line line1 = new Line(p1, p2);
        Point p3 = new Point(0, 0);
        Point p4 = new Point(3, 4);
        Line line2 = new Line(p3, p4);

        System.out.print("Line 1 -> ");
        line1.displayLineLength();

        System.out.print("Line 2 -> ");
        line2.displayLineLength();
    }
    }