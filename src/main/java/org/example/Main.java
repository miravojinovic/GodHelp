package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        driver.get("https://www.saucedemo.com/v1/");

        WebElement usernameInput = driver.findElement(By.cssSelector(("input[id='user-name']")));
        WebElement passwordInput = driver.findElement(By.cssSelector("input[id='password']"));
        WebElement loginButtonInput = driver.findElement(By.cssSelector("input[id='login-button']"));



        usernameInput.sendKeys("standard_user");
        passwordInput.sendKeys("secret_sausage");
        loginButtonInput.click();
//

        // sleep(5000);

//        driver.get("https://www.google.com/");
        driver.get("https://www.saucedemo.com/v1/");


        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("input[id='user-name']")));


        usernameInput.sendKeys("standard_user");
        passwordInput.sendKeys("secret_sauce");
        loginButtonInput.click();
//

        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("img.inventory_item_img")));
        //wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("product_label")));

        //WebElement productsTitle = driver.findElement(By.cssSelector("product_label"));
        //Assertions.assertEquals("Products", productsTitle.getText());
        //wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("#inventory_container > div > div:nth-child(1) > div.pricebar > button\"")));

        WebElement addToCart = driver.findElement(By.cssSelector("#inventory_container > div > div:nth-child(1) > div.pricebar > button"));
        addToCart.click();
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("#shopping_cart_container > a > svg > path")));
        WebElement otvoriKorpu = driver.findElement(By.cssSelector("#shopping_cart_container > a > svg > path"));

        otvoriKorpu.click();

        driver.findElement(By.cssSelector(("#cart_contents_container > div > div.cart_footer > a.btn_action.checkout_button"))).click();
        WebElement name = driver.findElement(By.cssSelector("#first-name"));
        name.sendKeys("Mare");
        WebElement lastName = driver.findElement(By.cssSelector("#last-name"));
        lastName.sendKeys("brebre");
        WebElement zipCode = driver.findElement(By.cssSelector("#postal-code"));
        zipCode.sendKeys("11070");
        WebElement ctn = driver.findElement(By.cssSelector("#checkout_info_container > div > form > div.checkout_buttons > input"));
        ctn.click();
        WebElement finish = driver.findElement(By.cssSelector("#checkout_summary_container > div > div.summary_info > div.cart_footer > a.btn_action.cart_button"));
        finish.click();
////        Assertions.assertTrue(driver.getPageSource().contains("Products"));
        WebElement myCart = driver.findElement(By.cssSelector("shopping_cart_container"));
//        wait.until(ExpectedConditions.visibilityOf(myCart));
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("shopping_cart_container")));
        myCart.click();

//        WebElement productsTitle = driver.findElement(By.cssSelector("product_label"));
//        Assertions.assertEquals("Products", productsTitle.getText());

    }
}