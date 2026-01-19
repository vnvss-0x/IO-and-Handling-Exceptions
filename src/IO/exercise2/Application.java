package IO.exercise2;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        MetierProduitImpl metier = new MetierProduitImpl("products.dat");
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (choice != 6) {
            System.out.println("\n--- Product Management ---");
            System.out.println("1. Display the list of products.");
            System.out.println("2. Search for a product by its ID.");
            System.out.println("3. Add a new product to the list.");
            System.out.println("4. Delete a product by ID.");
            System.out.println("5. Save the products.");
            System.out.println("6. Exit this program.");
            System.out.print("Choice: ");

            choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                for (Product p : metier.getAll()) System.out.println(p);
            } else if (choice == 2) {
                System.out.print("Enter ID: ");
                long id = scanner.nextLong();
                Product p = metier.findById(id);
                System.out.println(p != null ? p : "Product not found.");
            } else if (choice == 3) {
                System.out.print("ID: "); long id = scanner.nextLong(); scanner.nextLine();
                System.out.print("Name: "); String name = scanner.nextLine();
                System.out.print("Brand: "); String brand = scanner.nextLine();
                System.out.print("Price: "); double price = scanner.nextDouble(); scanner.nextLine();
                System.out.print("Description: "); String desc = scanner.nextLine();
                System.out.print("Stock: "); int stock = scanner.nextInt();
                metier.add(new Product(id, name, brand, price, desc, stock));
            } else if (choice == 4) {
                System.out.print("Enter ID to delete: ");
                long id = scanner.nextLong();
                metier.delete(id);
            } else if (choice == 5) {
                metier.saveAll();
                System.out.println("Products saved to products.dat");
            }
        }
    }
}