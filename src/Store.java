public class Store {
    public static void main(String[] args) {
        ProductForSale[] products = new ProductForSale[3];
        products[0] = new Chocolate("Chocolate", 2.5, "Delicious chocolate bar", "BestChoco");
        products[1] = new Coke("Coke", 1.0, "Refreshing cola drink", "Classic");
        products[2] = new Bread("Bread", 3.0, "Healthy whole wheat bread", "Whole Wheat");

        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
        for (ProductForSale product : products) {
            product.showDetails();
        }

    }
}