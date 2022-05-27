package login;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

/**
 * <p>Title: DashboardPage</p>
 * <p>Description: </p>
 *
 * @author yu.chen
 * @date 2021/6/2 2:03 PM
 * ------------------- History -------------------
 * <date>      <author>       <desc>
 * 2021/6/2   yu.chen    初始创建
 * -----------------------------------------------
 */
public class DashboardPage {

    @Steps
    StepDashboardPage dashPage;

    @Step
    public void verifyAdminLogin() {
        dashPage.loginVerify();
    }
}