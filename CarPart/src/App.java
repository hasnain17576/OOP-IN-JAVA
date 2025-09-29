import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc =new Scanner("System.in");
       CarPart c1=new CarPart();
       System.out.println("What is car name");
       String x=sc.nextLine();
       System.out.println("what is car model");
       String y=sc.nextLine();
       System.out.println("what is car nunber");
       String z=sc.nextLine();
       c1.setParameter(x,y,z);
       c1.display();

    }
}
