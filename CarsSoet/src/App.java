import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        Car[]cars={
            new Car("toyota",2019),
            new Car("honda",2021),
            new Car("toyota",2017),
            new Car("toyota",2020),
            new Car("toyota",2018),
           };
           Arrays.sort(cars,Comparator.comparingInt(c->c.year));
           System.out.println("Cars sorted by year:");
           for(Car c :cars){
            System.out.println(c.model+"-"+c.year);
           }
    }
}

