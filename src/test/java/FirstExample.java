import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import drivers.WebFormPage;
import utils.Defaults;
import utils.Waits;

import io.github.bonigarcia.wdm.WebDriverManager;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FirstExample {

    public WebDriver driver;
    public WebFormPage page;

    @BeforeAll
    public static void setDriver() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    public void setup() {
        driver = new ChromeDriver();
        page = PageFactory.initElements(driver, WebFormPage.class);
    }

    @AfterEach
    public void quit() {
        driver.quit();
    }

    @Test
    public void eightComponents() {
        driver.get(Defaults.WEB_FORM_URL);

        new Waits(driver).untilTitleIs("Web form");

        page.submitText("Selenium");
        assertEquals("Received!", page.getMessageText());

//        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
//
//        WebElement textBox = driver.findElement(By.name("my-text"));
//        textBox.sendKeys("Selenium");
//
//        WebElement submitButton = driver.findElement(By.cssSelector("button"));
//        submitButton.click();
//
//        WebElement message = driver.findElement(By.id("message"));
//        String value = message.getText();
//
//        assertEquals("Received!", value);



//        WebElement textBox = new WebDriverWait(driver, Duration.ofSeconds(10))
//                .until(driver -> driver.findElement(By.name("my-text")));
//        textBox.sendKeys("Selenium");
//
//        WebElement submitButton = new WebDriverWait(driver, Duration.ofSeconds(10))
//                .until(ExpectedConditions.elementToBeClickable(By.cssSelector("button")));
//        submitButton.click();
//
//        WebElement message = new WebDriverWait(driver, Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOfElementLocated(By.id("message")));
//        String value = message.getText();
//
//        assertEquals("Received!", value);
    }

}