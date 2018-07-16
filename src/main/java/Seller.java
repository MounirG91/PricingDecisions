public class Seller extends Person {

    public Seller() {
    }

    public Seller(String firstName, String lastName, String address) {
        super(firstName, lastName, address);
    }

    @Override
    public String toString() {
        return "Seller{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public void displayOfPricingBeans(int numberOfBeans) {
        this.setPricingBehavior(new SellerBehavior());
        System.out.println(this.toString() + " [Number of Beans that you should sale] = " + this.pricingBehavior.pricingBeans(numberOfBeans).numberOfBeansOrOunces
                + " [Cost Of Beans] = $" + this.pricingBehavior.pricingBeans(numberOfBeans).cost);
    }

}
