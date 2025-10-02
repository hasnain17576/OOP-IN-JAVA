import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        Product[]Products={
            new Product(1,"Laptop",1000),
            new Product(2,"phomr",700),
            new Product(3,"tablet",500),
            new Product(4,"headphone",150),
            new Product(5,"Charger",50),

        };
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter product name to search:");
        String search=sc.nextLine();
        boolean found=false;
        for(Product p:Products){
            if(p.name.equalsIgnoreCase(search)){
                System.out.println("product found;"+p.name+"Price:$"+p.price);
                found=true;
                break;
            }
        }
        if (!found){
            System.out.println("Product not found.");
        }
    }
}
