public class Test {

    public static void main(String[] args) {
        Seller seller = new Seller();
        seller.displayOfPricingBeans(5);
        seller.displayOfPricingOunces(16);

        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------");

        Customer customer = new Customer();
        customer.displayOfPricingBeans(5);
        customer.displayOfPricingOunces(16);


    }
}
