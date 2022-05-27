package login;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

/**
 * <p>Title: HomePage</p>
 * <p>Description: </p>
 *
 * @author yu.chen
 * @date 2021/6/2 2:03 PM
 * ------------------- History -------------------
 * <date>      <author>       <desc>
 * 2021/6/2   yu.chen    初始创建
 * -----------------------------------------------
 */
public class HomePage {
    @Steps
    StepHomePage homePage = new StepHomePage();

    @Step
    public void openApplication() {
        homePage.open();
    }

    @Step
    public void enterUsername() {
        homePage.userName();
    }

    @Step

    public void enterPassword() {
        homePage.password();
    }

    @Step

    public void clickOnLoginButton() {
        homePage.clickLogin();
    }

    @Step
    public void openErr(){
        //Integer.parseInt("abc");
    }
}