import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CustomerBehaviorTest {

    CustomerBehavior customerBehavior;

    @Before
    public void initializeBehavior() {
        customerBehavior = new CustomerBehavior();
    }

    @Test
    public void pricingBeans() {
        Pricing pricing = customerBehavior.pricingBeans(5);
        //Here it is better to buy 3 instead of 2, so the numberOfBeans become 6
        Assert.assertEquals(pricing.numberOfBeansOrOunces, 6);
        // numberOfBeans = 5,   5+1= 3+3 =  1$+1$=2$
        Assert.assertEquals(pricing.cost, 2, 0.001);
    }


}