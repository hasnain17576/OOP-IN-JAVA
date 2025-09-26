public class Car {
    public String Brand;
    public int model;

    Car(){
        Brand="audi";
        model=12334;
 
    }
    Car(String b, int m){
        Brand=b;
        model=m;
    }
    void showinfo(){
        System.out.println("Brand"+Brand);
        System.out.println("model"+model);
    }
    
}
