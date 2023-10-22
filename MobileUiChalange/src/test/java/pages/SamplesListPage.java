package pages;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Base;

public class SamplesListPage {

    private final Base base;
    public SamplesListPage(Base base){
        this.base = base;
    }
    public void waitUntilPageLoaded(String pageName) {
        WebDriverWait wait = new WebDriverWait(this.base.getDriver(), 10);

        WebElement loginText = wait.until(ExpectedConditions.presenceOfElementLocated(
                MobileBy.xpath("//android.widget.TextView[@text=" +"\""+ pageName +"\"" + "]")));
        assert (loginText.getText().contains(pageName));
    }
}
