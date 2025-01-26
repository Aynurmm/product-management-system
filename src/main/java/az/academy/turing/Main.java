package az.academy.turing;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", "Electronics", 1200, 4.5, true));
        products.add(new Product("Smartphone", "Electronics", 800, 4.7, true));
        products.add(new Product("Desk", "Furniture", 150, 4.0, true));
        products.add(new Product("Chair", "Furniture", 75, 3.9, true));
        products.add(new Product("Blender", "Appliances", 50, 3.8, false));

        ProductManager productManager=new ProductManager(products);
        System.out.println("\n\n===Sorted product by price ascending===\n\n");
        productManager.sortProductsByPriceAscending();

        System.out.println("\n\n===Sorted product by price descending===\n\n");
        productManager.sortProductsByPriceDescending();

        System.out.println("\n\n===Checking if the products are in stock===\n\n");
        productManager.printInStockProduct();

        System.out.println("\n\n===Filtering products whose names contain Desk===\n\n");
        productManager.filterAndPrintDeskProducts();

        System.out.println("\n\n===Cheapest product===\n\n");
        productManager.getAndPrintCheapestProduct();

        System.out.println("\n\n===Descending order by rating===\n\n");
        productManager.sortProductByRatingDescending();

        System.out.println("\n\n===Print all products===\n\n");
        productManager.printAllProducts();


    }
}