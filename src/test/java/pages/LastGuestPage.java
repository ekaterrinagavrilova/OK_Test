package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LastGuestPage extends BasePage{

    private static final By likeButton = By.xpath(".//*[@class='widget-list __dark __overlay inverted']//*[@class='widget_cnt controls-list_lk js-klass h-mod']//*[@class='widget_ico ic_klass']");

    public LastGuestPage(WebDriver driver) {
        super(driver);
    }

    protected void check() {
        (new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return isElementPresent(likeButton);
            }
        });
    }

    public void clickLike() {
        click(By.xpath(".//*[@class='widget-list __dark __overlay inverted']//*[@class='widget_cnt controls-list_lk js-klass h-mod']//*[@class='widget_ico ic_klass']"));
    }
}