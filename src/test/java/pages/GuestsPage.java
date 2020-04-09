package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GuestsPage extends BasePage {
    private static final By guests = By.xpath(".//*[@class='ugrid_cnt']//*[@class='ugrid_i']//*[@class='user-grid-card']");

    public GuestsPage(WebDriver driver) {
        super(driver);
    }

    protected void check() {
        (new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return isElementPresent(guests);
            }
        });
    }

    public void clickLastGuests() {
        click(By.xpath(".//*[@class='ugrid_cnt']//*[@class='ugrid_i']//*[@class='user-grid-card']")); // page guests
    }
}
