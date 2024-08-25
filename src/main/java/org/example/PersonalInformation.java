package org.example;//package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PersonalInformation extends BasePage {


    private static final String inputFirstNameCSSLocator = "#first-name";
    private static final String inputLastNameCSSLocator = "#last-name";
    private static final String inputPostalCodeCSSLocator = "#postal-code";
    private static final String continueButtonCSSLocator = "#continue";

    @FindBy(css = inputFirstNameCSSLocator)
    private WebElement inputFirstName;

    public PersonalInformation(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver,this);
    }

    public void enterFirstName(String firstname){

        enterText(inputFirstName,firstname);
    }
    @FindBy(css =inputLastNameCSSLocator )
    private WebElement inputLastName;

    public void enterLastName(String lastname){
        enterText(inputLastName,lastname);
    }

    @FindBy(css =inputPostalCodeCSSLocator )
    private WebElement inputpostalCode;

    public void enterPostalCode(String postalcode){
        enterText(inputpostalCode,postalcode);
    }
    @FindBy(css = continueButtonCSSLocator)
    private WebElement continueButton;

    public void clickOnContinueButton(){
        click(continueButton);
    }
}
