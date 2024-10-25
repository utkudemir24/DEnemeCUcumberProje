package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends ParentPage {
    public LeftNav() {
        PageFactory.initElements(GWD.getDriver(), this);
    }
@FindBy(xpath = "//a[@href='billpay.htm']")
    public WebElement billpay;

    @FindBy(xpath = "//a[@href='overview.htm']//font//font")
    public WebElement hesapbakiyePaying;



}
