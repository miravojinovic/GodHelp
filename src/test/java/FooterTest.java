import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Set;

public class FooterTest extends BasePageTest {


    @Test
    public void twiterLinktest() {
        LoginPage loginPage = new LoginPage(driver);
        ProductPage productPage = new ProductPage(driver);

        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickOnLoginButton();
        productPage.clickOnTwiterButton();

        String originalWindow = driver.getWindowHandle();

        Set<String> allWindows = driver.getWindowHandles();

        for (String windowHandle : allWindows) {
            if (!windowHandle.equals(originalWindow)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
        String curientURL = driver.getCurrentUrl();
        Assertions.assertTrue(curientURL.contains("x.com/saucelabs"), "the URL should contain 'x.com/saucelabs'");


    }

    @Test
    public void facebokLinkTest() {
        LoginPage loginPage = new LoginPage(driver);
        ProductPage productPage = new ProductPage(driver);

        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickOnLoginButton();
        productPage.clickOnFacebookButton();

        String originalWindow = driver.getWindowHandle();

        Set<String> allWindows = driver.getWindowHandles();

        for (String windowHandle : allWindows) {
            if (!windowHandle.equals(originalWindow)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
        String curientURL = driver.getCurrentUrl();
        Assertions.assertTrue(curientURL.contains("facebook.com/saucelabs"), "the URL should contain 'facebook.com/saucelabs'");


    }

    @Test
    public void linkedInLinkTest() {
        LoginPage loginPage = new LoginPage(driver);
        ProductPage productPage = new ProductPage(driver);

        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickOnLoginButton();
        productPage.clickOnLinkedInButton();

        String originalWindow = driver.getWindowHandle();

        Set<String> allWindows = driver.getWindowHandles();

        for (String windowHandle : allWindows) {
            if (!windowHandle.equals(originalWindow)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
        String curientURL = driver.getCurrentUrl();
        Assertions.assertTrue(curientURL.contains("www.linkedin.com/"), "the URL should contain 'www.linkedin.com/'");
    }
}

