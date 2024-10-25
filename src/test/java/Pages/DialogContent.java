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


    //Login(US602)
    @FindBy(xpath = "//input[@name='username']")
    public WebElement usernameLogin;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordLogin;

    @FindBy(xpath = "(//div[@class='login'])[3]/input")
    public WebElement buttonLogin;

    @FindBy(xpath = "//p[@class='smallText']")
    public WebElement successMessageLogin;


    //Paying Bilss(US603)
    @FindBy(xpath = "//input[@name='username']")
    public WebElement usernamePaying;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordPaying;

    @FindBy(xpath = "(//div[@class='login'])[3]/input")
    public WebElement buttonPaying;

    @FindBy(xpath = "//div[@id='billpayForm']/h1")
    public WebElement succesMessagePaying;

    @FindBy(xpath = "//input[@name='payee.name']")
    public WebElement payenamePaying;

    @FindBy(xpath = "//input[@name='payee.address.street']")
    public  WebElement adressPaying;

    @FindBy(xpath = "//input[@name='payee.address.city']")
    public  WebElement cityPaying;

    @FindBy(xpath = "//input[@name='payee.address.state']")
    public  WebElement statePaying;

    @FindBy(xpath = "//input[@name='payee.address.zipCode']")
    public  WebElement zipcodePaying;

    @FindBy(xpath = "//input[@name='payee.phoneNumber']")
    public  WebElement numberPaying;

    @FindBy(xpath = "//input[@name='payee.accountNumber']")
    public  WebElement accountPaying;

    @FindBy(xpath = "//input[@name='verifyAccount']")
    public  WebElement verifyaccountPaying;

    @FindBy(xpath = "//input[@name='amount']")
    public  WebElement amountPaying;

    @FindBy(xpath = "//select[@name='fromAccountId']")
    public  WebElement fromPaying;

    @FindBy(xpath = "//input[@value='Send Payment']")
    public  WebElement sendpaymentPaying;

    @FindBy(xpath = "//div[@id='billpayResult']/h1")
    public WebElement successMessageodemetamamPaying;





























}
