public abstract class Person {

    String firstName, lastName, address;

    PricingBehavior pricingBehavior;

    public Person() {
    }

    public Person(String firstName, String lastName, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    public void setPricingBehavior(PricingBehavior pricingBehavior) {
        this.pricingBehavior = pricingBehavior;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public void displayOfPricingOunces(int numberOfOunces) {
        System.out.println(this.toString() + " [Number of Ounces] = " + pricingBehavior.pricingOunces(numberOfOunces).numberOfBeansOrOunces
                + " [Cost of Ounces] = $" + pricingBehavior.pricingOunces(numberOfOunces).cost);
    }

    public abstract void displayOfPricingBeans(int numberOfBeans);

}
