package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {

    WebDriver driver;

    public Waits(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement untilVisible(WebElement element) {
        return new WebDriverWait(driver, Defaults.DEFAULT_TIMEOUT).until(ExpectedConditions.visibilityOf(element));
    }

    public WebElement untilClickable(WebElement element) {
        return new WebDriverWait(driver, Defaults.DEFAULT_TIMEOUT).until(ExpectedConditions.elementToBeClickable(element));
    }

    public void untilTitleIs(String titleText) {
        new WebDriverWait(driver, Defaults.DEFAULT_TIMEOUT).until(ExpectedConditions.titleIs(titleText));
    }

}
