package az.academy.turing;

public class Product implements Comparable<Product> {

    private String name;
    private String category;
    private double price;
    private double rating;
    private boolean inStock;

    public Product(String name, String category, double price, double rating, boolean inStock) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.rating = rating;
        this.inStock = inStock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }

    @Override
    public int compareTo(Product products) {
        return this.name.compareTo(products.name);
    }

    @Override
    public String toString() {
        return "Product {name ='" + name + '\'' +
                ", category ='" + category + '\'' +
                ", price =" + price +
                ", rating =" + rating +
                ", inStock =" + inStock + '}';
    }

}
