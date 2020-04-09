package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UserMainPage extends BasePage{

    public static final By GUESTS_TOOL_BAR = By.xpath(".//*[@class='toolbar_nav']//li[@data-l='t,guests']");

    public UserMainPage(WebDriver driver) {
        super(driver);
    }

    protected void check() {
        (new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return isElementPresent(GUESTS_TOOL_BAR);
            }
        });
    }

    public void clickGuestsOnToolbar() {
        click(By.xpath(".//*[@class='toolbar_nav']//li[@data-l='t,guests']")); // to guest
    }
}




