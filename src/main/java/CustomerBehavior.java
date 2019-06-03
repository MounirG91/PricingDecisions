public class CustomerBehavior implements PricingBehavior {


    public CustomerBehavior() {
    }

    // n>3 : what does n beans cost ?
    public double pricingManyBeans(int numberOfBeans) {
        if (numberOfBeans % 3 == 0) {
            return (numberOfBeans / 3) * 1;
        }
        else if (numberOfBeans % 3 == 1) {
            return (numberOfBeans / 3) * 1 + 0.65;
        }
            // Here it is better to buy 3 instead of 2
        else {
            return (numberOfBeans / 3) * 1 + 1;
        }
    }


    // Here we describe the winning strategy for the customer
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
            // Take the 3rd free
            pricing.numberOfBeansOrOunces = 3;
        } else if (numberOfBeans == 3) {
            pricing.cost = pricingThreeBeans();
        }
        else {
            pricing.cost = pricingManyBeans(numberOfBeans);
            // Take the 3rd free
            if (numberOfBeans % 3 == 2)
                pricing.numberOfBeansOrOunces = numberOfBeans + 1;
        }
        return pricing;
    }
}
