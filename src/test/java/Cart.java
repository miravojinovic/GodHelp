import org.example.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Cart extends BasePageTest {

    @Test
    public void successfulByingItem(){
        LoginPage loginPage = new LoginPage(driver);
        Cart  productPage = new Cart();

        PersonalInformation PersonalInformation = new PersonalInformation(driver);
//        OverviewPage overviewPage = new OverviewPage(driver);
//
//        loginPage.enterUsername("standard_user");
//        loginPage.enterPassword("secret_sauce");
//        loginPage.clickOnLoginButton();
//        productPage.clickOnAddToCartButton();
//        productPage.clickOnShopingButton();
//        myCartPage.clickOnCheckoutButton();
//        informationPage.enterFirstName("Mira");
//        informationPage.enterLastName("Kovacevic");
//        informationPage.enterPostalCode("11070");
//        informationPage.clickOnContinueButton();
//        Assertions.assertTrue(driver.getPageSource().contains("Sauce Labs Backpack"));
//        overviewPage.clickOnFinishButton();
//        Assertions.assertTrue(driver.getPageSource().contains("Thank you for your order!"));

    }
}


