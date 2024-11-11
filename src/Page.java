import java.util.ArrayList;
import java.util.Scanner;

public class Page {
    private ArrayList<Product> products;
    private Scanner sc ;
    public Page(){
        products = new ArrayList<>();
        sc = new Scanner(System.in);
    }

    public void addProduct(){
        System.out.println("       Add Product");
        System.out.println("---------------------------");
        System.out.println("Enter Product Id: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Product Name: ");
        String name = sc.nextLine();
        System.out.println("Enter Product Price: ");
        double price = sc.nextDouble();
        products.add(new Product(id, name, price));
    }

    public void deleteProduct(){
        System.out.println("       Delete Product");
        System.out.println("---------------------------");
        System.out.println("Enter Product Id: ");
        int id = sc.nextInt();
        sc.nextLine();
        for(Product product: products){
            if(product.getId() == id){
                products.remove(product);
                System.out.println("Product has deleted successfully");
                return;
            }
        }
        System.out.println("there is no product with id: " + id);
    }

    public void editProduct(){
        System.out.println("       Edit Product");
        System.out.println("---------------------------");
        System.out.println("Enter Product Id: ");
        int id = sc.nextInt();
        sc.nextLine();
        for(Product product: products){
            if(product.getId() == id){
                System.out.println("Enter new Product Name: ");
                String name = sc.nextLine();
                product.setName(name);
                System.out.println("Enter new Product Price: ");
                double price = sc.nextDouble();
                product.setPrice(price);
                System.out.println("Product has updated successfully");
                return;
            }
        }
        System.out.println("there is no product with id: " + id);
    }
    public void showAllProducts(){
        System.out.println("       Show All Product");
        System.out.println("---------------------------");
        if(products.isEmpty()){
            System.out.println("there is no products available");
        }
        else {
            System.out.println("All available Products:");
            for(Product product : products){
                System.out.println(product);
            }
        }
    }
}
