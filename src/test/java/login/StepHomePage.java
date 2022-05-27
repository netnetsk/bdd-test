package login;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

/**
 * <p>Title: StepHomePage</p>
 * <p>Description: </p>
 *
 * @author yu.chen
 * @date 2021/6/2 2:03 PM
 * ------------------- History -------------------
 * <date>      <author>       <desc>
 * 2021/6/2   yu.chen    初始创建
 * -----------------------------------------------
 */
@DefaultUrl("https://opensource-demo.orangehrmlive.com/")
public class StepHomePage extends PageObject {
    public void userName() {
        $(By.name("txtUsername")).sendKeys(("Admin"));
    }

    public void password() {
        $(By.name("txtPassword")).sendKeys(("admin123"));

    }

    public void clickLogin() {
        $(By.name("Submit")).click();
    }
}