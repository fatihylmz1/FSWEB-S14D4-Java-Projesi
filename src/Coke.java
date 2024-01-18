public class Coke extends ProductForSale{

    private String flavor;
    public Coke(String type, double price, String description , String flavor) {
        super(type, price, description);
        this.flavor=flavor;
    }

    public String getFlavor() {
        return flavor;
    }

    @java.lang.Override
    public void showDetails() {
        System.out.println("Coke Details:");
        System.out.println("Type: " + getType());
        System.out.println("Price: $" + getPrice());
        System.out.println("Description: " + getDescription());
        System.out.println("Flavor: " + getFlavor());
        System.out.println("Sales Price: $" + getSalesPrice(1));
    }
}
