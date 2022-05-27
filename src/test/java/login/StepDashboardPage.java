package login;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * <p>Title: StepDashboard</p>
 * <p>Description: </p>
 *
 * @author yu.chen
 * @date 2021/6/2 2:03 PM
 * ------------------- History -------------------
 * <date>      <author>       <desc>
 * 2021/6/2   yu.chen    初始创建
 * -----------------------------------------------
 */
public class StepDashboardPage extends PageObject {
    public void loginVerify() {
        String dashboardTitle = $(By.id("welcome")).getText();
        assertThat(dashboardTitle, containsString("Welcome"));
    }
}