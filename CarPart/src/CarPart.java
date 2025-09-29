public class CarPart {
    private String Carname;
    private String model;
    private String number;
    public void setParameter(String x,String y,String z){
        Carname=x;
        model=y;
        number=z;
    }
    public void display(){
        System.out.println("car name is::"+Carname);
        System.out.println("the car model is::"+model);
        System.out.println("the  car number is ::"+number);
    }
}
