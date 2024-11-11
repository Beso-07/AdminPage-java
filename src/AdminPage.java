import java.util.Scanner;

public class AdminPage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Page page = new Page();

        while (true){
            System.out.println("\n   Student Management System ");
            System.out.println("--------------------------------------");
            System.out.println("1. Add Product");
            System.out.println("2. Delete Product");
            System.out.println("3. Edit Product");
            System.out.println("4. Show All Products");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice;
                choice = sc.nextInt();
                sc.nextLine();

            switch (choice){
                case 1:
                    page.addProduct();
                    break;
                case 2:
                    page.deleteProduct();
                    break;
                case 3:
                    page.editProduct();
                    break;
                case 4:
                    page.showAllProducts();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
