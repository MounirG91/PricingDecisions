public class Customer extends Person {

    public Customer() {
    }

    public Customer(String firstName, String lastName, String address) {
        super(firstName, lastName, address);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public void displayOfPricingBeans(int numberOfBeans) {
        this.setPricingBehavior(new CustomerBehavior());
        System.out.println(this.toString() + " [Number of Beans that you should buy] = " + this.pricingBehavior.pricingBeans(numberOfBeans).numberOfBeansOrOunces
                + " [Cost of Beans] = $" + this.pricingBehavior.pricingBeans(numberOfBeans).cost);
    }
}
