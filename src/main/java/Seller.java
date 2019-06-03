public class Seller extends Person {

    public Seller() {
        super();
    }

    @Override
    public void displayOfPricingBeans(int numberOfBeans) {
        this.setPricingBehavior(new SellerBehavior());
        System.out.println(this.toString() + " [Number of Beans that you should sale] = " + this.pricingBehavior.pricingBeans(numberOfBeans).numberOfBeansOrOunces
                + " [Cost Of Beans] = $" + this.pricingBehavior.pricingBeans(numberOfBeans).cost);
    }

}
