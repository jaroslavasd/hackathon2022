package drivers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

// page_url = about:blank
public class Form {

    public Form(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "message")
    WebElement message;

    @FindBy(how = How.CSS, using = "button")
    WebElement submitButton;

    @FindBy(how = How.NAME, using = "my-text")
    WebElement textInput;

    public void setText(String text) {
        textInput.sendKeys(text);
//        textBox.sendKeys("Selenium");
//
//
//        searchBox.sendKeys(text);
//        searchBox.submit();
    }
}