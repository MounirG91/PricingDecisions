import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

// Here to test default methods of PricingBehavior interface
public class PricingBehaviorTest {

    // Or CustomerBehavior
    SellerBehavior pricingBehavior;

    @Before
    public void initializeBehavior() {
        pricingBehavior = new SellerBehavior();
    }

    @Test
    public void pricingOunces() {
        Pricing pricing = pricingBehavior.pricingOunces(4);
        Assert.assertEquals(pricing.cost, 1.99 / 4, 0.001);
    }

    @Test
    public void pricingOneBean() {
        Assert.assertEquals(pricingBehavior.pricingOneBean(), 0.65, 0.001);
    }

    @Test
    public void pricingTwoBeans() {
        Assert.assertEquals(pricingBehavior.pricingTwoBeans(), 0.65 * 2, 0.001);
    }

    @Test
    public void pricingThreeBeans() {
        Assert.assertEquals(pricingBehavior.pricingThreeBeans(), 1, 0.001);
    }

    @Test
    public void pricingNBeans() {
        Assert.assertEquals(pricingBehavior.pricingManyBeans(5), 1 + 0.65 + 0.65, 0.001);
    }
}
