public class App {
    public static void main(String[] args) throws Exception {
        Date Date1,Date2;
        Date1=new Date();
        Date1.month="April";
        Date1.day=4;
        Date1.year=2020;
        Date1.display();
        Date2=new Date();
        Date2.month="may";
        Date2.day=4;
        Date2.year=2030;
        Date2.display();
    }
}
