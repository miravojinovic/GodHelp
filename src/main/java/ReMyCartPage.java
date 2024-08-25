import org.example.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReMyCartPage extends BasePage {

    private static final String checkoutBottonCSSLocator = " [data-test=checkout]";
    private static final String remoweBottonCSSSelector = "#remove-sauce-labs-backpack";


    @FindBy(css =checkoutBottonCSSLocator )
    private WebElement checkoutButton;

    public ReMyCartPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver,this);
    }

    public void clickOnCheckoutButton(){
        click(checkoutButton);
    }
    @FindBy(css = remoweBottonCSSSelector)
    private WebElement remoweButton;

    public void clickOnRemoweBotton(){
        click(remoweButton);
    }
}

