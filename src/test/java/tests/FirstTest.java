package tests;

import pages.*;
import org.junit.Test;

public class FirstTest extends BaseTest {

    @Test
    public void testGroupCreation() {
        /*String login = "technopolisbot"; // no guests
        String password = "technopolis16";*/

        String login = "89819350633"; // guests are exist
        String password = "gavK2000";

        new LoginPage(driver).doLogin(login, password);
        new UserMainPage(driver).clickGuestsOnToolbar();

        GuestsPage guestsPage = new GuestsPage(driver);

        guestsPage.clickLastGuests();

        LastGuestPage guestsLastPage = new LastGuestPage(driver);

        guestsLastPage.clickLike();

    }
}
