public interface PricingBehavior {

    //What does n beans cost ?
    public Pricing pricingBeans(int numberOfBeans);

    //1 pound = 16 ounces
    //What does n ounces cost ?
    public default Pricing pricingOunces(int numberOfOunces) {
        return new Pricing(numberOfOunces, (double) (numberOfOunces) * 1.99 / 16);
    }

    // 1 bean for 0.65$
    public default double pricingOneBean() {
        return 0.65;
    }

    // 2 beans for 2 * 0.65$
    public default double pricingTwoBeans() {
        return 2 * 0.65;
    }

    // 3 beans for 1$
    public default double pricingThreeBeans() {
        return 1;
    }

    // n>3 : what does n beans cost ?
    public default double pricingNBeans(int n) {
        if (n % 3 == 0) return (n / 3) * 1;
        else return (n / 3) * 1 + (n % 3) * 0.65;
    }

}
