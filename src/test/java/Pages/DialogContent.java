package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent  extends ParentPage{
    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(),this);
    }


    @FindBy(xpath = "(//div[@id='loginPanel']//a)[2]")
    public WebElement registerLink;

    @FindBy(xpath = "//input[@id=\"customer.firstName\"]")
    public WebElement firstName;

    @FindBy(xpath = "//input[@id=\"customer.lastName\"]")
    public WebElement lastName;

    @FindBy(xpath = "//input[@id=\"customer.address.street\"]")
    public WebElement adress;

    @FindBy(xpath = "//input[@id=\"customer.address.city\"]")
    public WebElement city;

    @FindBy(xpath = "//input[@id=\"customer.address.state\"]")
    public WebElement state;

    @FindBy(xpath = "//input[@id=\"customer.address.zipCode\"]")
    public WebElement zipCode;

    @FindBy(xpath = "//input[@id=\"customer.phoneNumber\"]")
    public WebElement phone;

    @FindBy(xpath = "//input[@id=\"customer.ssn\"]")
    public WebElement snn;

    @FindBy(xpath = "//input[@id=\"customer.username\"]")
    public WebElement userName;

    @FindBy(xpath = "//input[@id=\"customer.password\"]")
    public WebElement password;

    @FindBy(xpath = "//input[@id=\"repeatedPassword\"]")
    public WebElement repeatedPassword;

    @FindBy(xpath = "(//input[@class=\"button\"])[2]")
    public WebElement registerButton;

    @FindBy(xpath = "//div[@id='rightPanel']//p")
    public WebElement successMessage;





}
