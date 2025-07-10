import com.microsoft.playwright.*;
import org.junit.jupiter.api.*;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

class LandingPageTest {
    static Playwright playwright;
    static Browser browser;
    BrowserContext context;
    Page page;

    @BeforeAll
    static void launchBrowser() {
        playwright = Playwright.create();
        browser = playwright.chromium().launch();
    }

    @AfterAll
    static void closeBrowser() {
        playwright.close();
    }

    @BeforeEach
    void createContextAndPage() {
        context = browser.newContext();
        page = context.newPage();
    }

    @AfterEach
    void closeContext() {
        context.close();
    }

    @Test
    public void usersAreWelcomedToTheApp() {
        page.navigate("http://localhost:8080");
        Locator pageBody = page.locator("body");
        assertThat(pageBody).containsText("Welcome to MakersBnB");
    }

    @Test
    public void emailisgivenout() {
        page.navigate("http://localhost:8080/contactus");
        Locator pageBody = page.locator("body");
        assertThat(pageBody).containsText("999 or something like that");
    }

    @Test
    public void staffareshown() {
        page.navigate("http://localhost:8080/team");
        Locator pageBody = page.locator("body");
        assertThat(pageBody).containsText("Toby, Katerina, Sandy");
    }
}