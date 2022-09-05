package drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import utils.Waits;

public class WebFormPage {

    WebDriver driver;
    Waits wait;

    public WebFormPage(WebDriver driver) {
//        PageFactory.initElements(driver, this);
        this.driver = driver;

        wait = new Waits(driver);
    }

    private @FindBy(id = "message")
    WebElement messageText;

    private @FindBy(how = How.CSS, using = "button")
    WebElement submitButton;

    private @FindBy(how = How.NAME, using = "my-text")
    WebElement textInput;

    public void submitText(String text) {
        wait.untilVisible(textInput);
        textInput.sendKeys(text);

        wait.untilClickable(submitButton);
        submitButton.click();
    }

    public String getMessageText() {
        wait.untilVisible(messageText);
        return messageText.getText();
    }
}