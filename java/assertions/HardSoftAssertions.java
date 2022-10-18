package assertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardSoftAssertions {

    /* For Hard assertions A hard assert stops
    immediately after a failure then continues on to
    the next annotation. In this case, assertEquals
    failed so the subsequent assertions within this method
     were skipped and the script went on to the next @Test method*/

    @Test
    public void hardAsseration()
    {
        Assert.assertEquals(1,3,"that is True !!");
        Assert.assertFalse(false,"False Condition");
        Assert.assertTrue(false,"true Condition");
    }
   /* A soft assert continues execution after a fail
    and moves on to the next statement line.
    It was designed to keep executing
    even when a verification step fails.*/

    @Test
    public void softAsseration()
    { //To use a soft assert, first we declare SoftAssert which is a class in TestNG.
        SoftAssert softAssert = new SoftAssert();

        softAssert.assertEquals(1,3,"that is True !!");
        softAssert.assertFalse(false,"False Condition");
        softAssert.assertTrue(false,"true Condition");
    // assertAll() will store exceptions
    softAssert.assertAll();
    }

}
