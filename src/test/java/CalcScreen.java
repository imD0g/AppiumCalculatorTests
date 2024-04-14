import io.appium.java_client.android.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalcScreen {

    @FindBy(id= Setup.PACKAGE_ID+":id/digit_0")
    WebElement btn0;
    @FindBy(id=Setup.PACKAGE_ID+":id/digit_1")
    WebElement btn1;

    @FindBy(id=Setup.PACKAGE_ID+":id/digit_2")
    WebElement btn2;

    @FindBy(id=Setup.PACKAGE_ID+":id/digit_3")
    WebElement btn3;

    @FindBy(id=Setup.PACKAGE_ID+":id/digit_4")
    WebElement btn4;

    @FindBy(id=Setup.PACKAGE_ID+":id/digit_5")
    WebElement btn5;

    @FindBy(id=Setup.PACKAGE_ID+":id/digit_6")
    WebElement btn6;

    @FindBy(id=Setup.PACKAGE_ID+":id/digit_7")
    WebElement btn7;

    @FindBy(id=Setup.PACKAGE_ID+":id/digit_8")
    WebElement btn8;

    @FindBy(id=Setup.PACKAGE_ID+":id/digit_9")
    WebElement btn9;

    @FindBy(id=Setup.PACKAGE_ID+":id/op_add")
    WebElement btnPlus;

    @FindBy(id=Setup.PACKAGE_ID+":id/op_sub")
    WebElement btnMinus;

    @FindBy(id=Setup.PACKAGE_ID+":id/op_div")
    WebElement btnDiv;

    @FindBy(id=Setup.PACKAGE_ID+":id/op_mul")
    WebElement btnMul;

    @FindBy(id=Setup.PACKAGE_ID+":id/op_pct")
    WebElement btnPercentage;

    @FindBy(id=Setup.PACKAGE_ID+":id/eq")
    WebElement btnEqual;

    @FindBy(id=Setup.PACKAGE_ID+":id/clr")
    WebElement btnClear;

    @FindBy(id = Setup.PACKAGE_ID+":id/result_final")
    WebElement resultFinal;

    private final AndroidDriver driver;

    /**
     * Constructor
     *
     * @param driver AndroidDriver
     */
    public CalcScreen(AndroidDriver driver){
        // Set the driver
        this.driver = driver;

        // Initialize elements
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

    public WebElement getNumberButtonElement(int number) {
        String id = Setup.PACKAGE_ID + ":id/digit_" + number;
        return driver.findElement(By.id(id));
    }


    /**
     * This method will add two passed in numbers
     * @return String
     */
    public String doSum(int x, int y) throws InterruptedException {
        // Get the desired button and click on it
        getNumberButtonElement(x).click();

        // Click on the add button
        btnPlus.click();

        // Get the 2nd desired button and click on it
        getNumberButtonElement(y).click();

        // Click on the equal button
        btnEqual.click();

        // Return the result
        return resultFinal.getText();
    }

    public String doSub(int x, int y) {
        // Get the desired button and click on it
        getNumberButtonElement(x).click();

        // Click on the subtract button
        btnMinus.click();

        // Get the 2nd desired button and click on it
        getNumberButtonElement(y).click();

        // Click on the equal button
        btnEqual.click();

        // Return the result
        return resultFinal.getText();
    }

    public String doMul(int x, int y) {
        // Get the desired button and click on it
        getNumberButtonElement(x).click();

        // Click on the multiply button
        btnMul.click();

        // Get the 2nd desired button and click on it
        getNumberButtonElement(y).click();

        // Click on the equal button
        btnEqual.click();

        // Return the result
        return resultFinal.getText();
    }

    public String doDiv(int x, int y) throws InterruptedException {
        // Get the desired button and click on it
        getNumberButtonElement(x).click();

        // Click on the multiply button
        btnDiv.click();

        // Get the 2nd desired button and click on it
        getNumberButtonElement(y).click();

        // Click on the equal button
        btnEqual.click();

        // Return the result
        return resultFinal.getText();
    }
}
