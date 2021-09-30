    
package pagefactoryPOM;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPOM {
    WebDriver driver;
    LoginPOM obj=new LoginPOM(driver);
    
    
    @FindBy(name="Email")
    WebElement email;
    
    @FindBy(id="Password")
    WebElement password;
    
    @FindBy(xpath="//input[@class='button-1 login-button']")
    WebElement loginbtn;
    
    public LoginPOM(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }
    
    public void inputemail(String EM) {
        email.sendKeys(EM);
    }
    
    public void inputpassword(String pwd) {
        password.sendKeys(pwd);
    }
    
    public void clicklogin() {
        loginbtn.click();
    }
}
 





