public class Bread extends ProductForSale{

    private String breadType;

    public Bread(String type, double price, String description , String breadType) {
        super(type, price, description);
        this.breadType=breadType;
    }

    public String getBreadType() {
        return breadType;
    }

    @java.lang.Override
    public void showDetails() {
        System.out.println("Bread Details:");
        System.out.println("Type: " + getType());
        System.out.println("Price: $" + getPrice());
        System.out.println("Description: " + getDescription());
        System.out.println("Bread Type: " + getBreadType());
        System.out.println("Sales Price: $" + getSalesPrice(1));
    }
}
