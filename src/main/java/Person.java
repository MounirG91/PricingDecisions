public abstract class Person {

    PricingBehavior pricingBehavior;

    public void setPricingBehavior(PricingBehavior pricingBehavior) {
        this.pricingBehavior = pricingBehavior;
    }

    public void displayOfPricingOunces(int numberOfOunces) {
        System.out.println(this.toString() + " [Number of Ounces] = " + pricingBehavior.pricingOunces(numberOfOunces).numberOfBeansOrOunces
                + " [Cost of Ounces] = $" + pricingBehavior.pricingOunces(numberOfOunces).cost);
    }

    public abstract void displayOfPricingBeans(int numberOfBeans);

}
