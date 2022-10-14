package dependancy_testing;

import org.testng.annotations.Test;

public class DependOnGroub {
    @Test (groups = "initialize")
    public void test1_SetUpChrome() {}

    @Test (dependsOnGroups = "initialize", groups = "env_application")
    public void test2_OpenOrangeHRM() {}

    @Test  (dependsOnGroups = "env_application")
    public void test3_SignIn() {}

    @Test  (dependsOnGroups = "env_application")
    public void test4_SearchUser() {}

    @Test  (dependsOnGroups = "env_application")
    public void test5_SearchEmployee() {}

    @Test  (dependsOnGroups = "env_application")
    public void test6_SearchCandidate() {}

    @Test(dependsOnGroups = "env_application")
    public void test7_SignOut() {}

}
