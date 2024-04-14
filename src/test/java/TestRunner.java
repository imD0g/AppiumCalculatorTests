import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestRunner extends Setup {

    private CalcScreen calcScreen;


    @BeforeMethod
    public void setUp() {
        calcScreen = new CalcScreen(driver);
    }

    @Test(priority = 1, description = "Sum of 2 numbers")
    public void doSum() throws InterruptedException {
        Assert.assertEquals(calcScreen.doSum(9, 9), String.valueOf(9 + 9));
    }

    @Test(priority = 2, description = "Sub of 2 numbers")
    public void doSub() {
        Assert.assertEquals(calcScreen.doSub(8, 7), String.valueOf(8 - 7));
    }

    @Test(priority = 3, description = "Multiply 2 numbers")
    public void doMul() {
        Assert.assertEquals(calcScreen.doMul(6, 5), String.valueOf(6 * 5));
    }

    @Test(priority = 4, description = "Divide the result of multiplication with 10")
    public void doDiv() throws InterruptedException {
        Assert.assertEquals(calcScreen.doDiv(4, 2), String.valueOf(4 / 2));
    }

    @AfterMethod
    public void clearScreen() {
        calcScreen.btnClear.click(); //clear the digit
    }
}
