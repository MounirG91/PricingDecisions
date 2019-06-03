public class SellerBehavior implements PricingBehavior {

    public SellerBehavior() {
    }

    // Here we describe the winning strategy for the seller
    public Pricing pricingBeans(int numberOfBeans) {
        Pricing pricing = new Pricing();
        pricing.numberOfBeansOrOunces = numberOfBeans;
        if (numberOfBeans == 0) {
            pricing.cost = 0;
        }
        else if (numberOfBeans == 1) {
            pricing.cost = pricingOneBean();
        }
        else if (numberOfBeans == 2) {
            pricing.cost = pricingTwoBeans();
        }
        else if (numberOfBeans == 3) {
            pricing.cost = pricingThreeBeans();
        }
        else {
            pricing.cost = pricingManyBeans(numberOfBeans);
        }
        return pricing;
    }

}