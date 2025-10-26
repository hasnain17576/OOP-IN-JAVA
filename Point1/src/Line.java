public class Line {
    private Point startPoint;
    private Point endPoint;
    public Line(Point startPoint, Point endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }
    public double getLength() {
        double x1 = startPoint.getXCord();
        double y1 = startPoint.getYCord();
        double x2 = endPoint.getXCord();
        double y2 = endPoint.getYCord();

        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }
    public void displayLineLength() {
        System.out.println("Length of line: " + getLength());
    }
}
