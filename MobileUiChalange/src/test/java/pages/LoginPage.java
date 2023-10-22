package pages;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.Base;

public class LoginPage {
    private final Base base;
    public LoginPage(Base base){
        this.base = base;
    }
        public void waitUntilPageLoaded(String pageName) {
            WebDriverWait wait = new WebDriverWait(this.base.getDriver(), 10);

            WebElement loginText = wait.until(ExpectedConditions.presenceOfElementLocated(
                    MobileBy.xpath("//android.widget.TextView[@text=" +"\""+ pageName +"\"" + "]")));
            assert (loginText.getText().contains(pageName));
        }
        public void enterValueToField(String value, String fieldName) {
            WebDriverWait wait = new WebDriverWait(this.base.getDriver(), 10);
            WebElement username = wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId(fieldName)));
            username.sendKeys(value);
        }

        public void pressTheLogInButton(String buttonName){
            WebElement login = this.base.getDriver().findElement(MobileBy.xpath("//android.widget.TextView[@text="+"\"" + buttonName +"\""+ "]"));
            login.click();
        }

        public void errorModalWindow(){
            WebDriverWait wait = new WebDriverWait(this.base.getDriver(), 10);

            WebElement errorMessageText = wait.until(ExpectedConditions.presenceOfElementLocated(
                    MobileBy.xpath("//android.widget.TextView[@resource-id=\"android:id/message\"]")));
            assert (errorMessageText.getText().contains("Invalid Credentials"));
        }

        public void pressOkButtonErrorBadCred() {
            WebElement login = this.base.getDriver().findElement(MobileBy.xpath("//android.widget.Button[@resource-id=\"android:id/button1\"]"));
            login.click();
        }
}
