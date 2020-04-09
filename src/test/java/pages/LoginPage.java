package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage{

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public static final By enter = By.xpath(".//*[contains(@value,'Войти')]");

    protected void check() {
        (new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return isElementPresent(enter);
            }
        });
    }

    public void doLogin(String login, String password) {
        driver.findElement(By.id("field_email")).sendKeys(login);
        driver.findElement(By.id("field_password")).sendKeys(password);
        click(By.xpath(".//*[contains(@value,'Войти')]"));
    }
}