import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SellerBehaviorTest {

    SellerBehavior sellerBehavior;

    @Before
    public void initializeBehavior() {
        sellerBehavior = new SellerBehavior();
    }

    @Test
    public void pricingBeans() {
        Pricing pricing = sellerBehavior.pricingBeans(5);
        Assert.assertEquals(pricing.numberOfBeansOrOunces, 5);
        // numberOfBeans = 5,   5= 3+2 =  1$+(065*2)$
        Assert.assertEquals(pricing.cost, 1 + (0.65 * 2), 0.001);
    }
}
