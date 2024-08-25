import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoginTests extends BasePageTest {




    @Test
    public void successfullLoginTest(){
        LoginPage loginPage = new LoginPage(driver);

        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickOnLoginButton();
        Assertions.assertTrue(driver.getPageSource().contains("Products"));
    }

    @Test
    public void cannotLoginWithInvalidCredentialsTest() {
        LoginPage loginPage = new LoginPage(driver);

        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("wrongpassword");
        loginPage.clickOnLoginButton();

        String expectedErrorMesage = "Epic sadface: Username and password do not match any user in this service";
        loginPage.waitForErrorMessageToContain(expectedErrorMesage);
    }


    @Test
    public void loginWithLoctOutCredentialsTest(){
        LoginPage loginPage = new LoginPage(driver);

        loginPage.enterUsername("locked_out_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickOnLoginButton();
        String expectedErrorMesage = "Epic sadface: Sorry, this user has been locked out";
        loginPage.waitForErrorMessageToContain(expectedErrorMesage);



    }


}

