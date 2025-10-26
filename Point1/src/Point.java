public class Point {
    private double xCord;
    private double yCord;
    public Point(double x, double y) {
        this.xCord = x;
        this.yCord = y;
    }
    public void setXCord(double x) {
        this.xCord = x;
    }

    public void setYCord(double y) {
        this.yCord = y;
    }
    public double getXCord() {
        return xCord;
    }

    public double getYCord() {
        return yCord;
    }
    public void displayPoint() {
        System.out.println("(" + xCord + ", " + yCord + ")");
    }
}

