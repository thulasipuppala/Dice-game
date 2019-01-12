import org.junit.Assert;
import org.junit.Test;

public class DiceTest {

    @Test
    public void testTossAndSum(){

        Dice dice = new Dice(2);
        int actual = dice.tossAndSum();

        Assert.assertTrue(actual>2 && actual<12);

    }

}
