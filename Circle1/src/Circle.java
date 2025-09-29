public class Circle {
    private int radius;

    public Circle(){
        radius=7;
    }
    Circle(int r){
        radius=r;
    }
    public void setRadius(int r){
        radius=r;
    }
    public int getRadius(){
        return radius ;

    }
    public void display(){
        System.out.println("radius is :;"+radius );

    }
    public double CalculateCircumference(){
        double a=Math.PI*radius*radius;
        return a;

}
}