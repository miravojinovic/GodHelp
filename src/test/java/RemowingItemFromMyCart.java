import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class RemowingItemFromMyCart extends BasePageTest {
    @Test
    public void successfullRemowingItem(){

        LoginPage loginPage = new LoginPage(driver);
        ProductPage productPage = new ProductPage(driver);
        ReMyCartPage myCartPage = new ReMyCartPage(driver);

        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickOnLoginButton();
        productPage.clickOnAddToCartButton();
        productPage.clickOnShopingButton();
        Assertions.assertTrue(driver.getPageSource().contains("Sauce Labs Backpack"));
        myCartPage.clickOnRemoweBotton();
        Assertions.assertFalse(driver.getPageSource().contains("Sauce Labs Backpack"));



    }


}