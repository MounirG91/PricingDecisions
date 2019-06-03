public class Customer extends Person {

    public Customer() {
        super();
    }


    @Override
    public void displayOfPricingBeans(int numberOfBeans) {
        this.setPricingBehavior(new CustomerBehavior());
        System.out.println(this.toString() + " [Number of Beans that you should buy] = " + this.pricingBehavior.pricingBeans(numberOfBeans).numberOfBeansOrOunces
                + " [Cost of Beans] = $" + this.pricingBehavior.pricingBeans(numberOfBeans).cost);
    }
}
