package dependancy_testing;

import org.testng.annotations.Test;
/* Without depend_on_method there's a cascade of failures - that's
when one failure forces the remaining tests in the suite to fail
**/
public class DependOnMethod {
    @Test
    public void test1_SetUpChrome() {}

    @Test (dependsOnMethods = "test1_SetUpChrome")
    public void test2_OpenOrangeHRM() {}

    @Test(dependsOnMethods = "test2_OpenOrangeHRM")
    public void test3_SignIn() {}

    @Test (dependsOnMethods = "test3_SignIn")
    public void test4_SearchUser() {}

    @Test (dependsOnMethods = { "test2_OpenOrangeHRM", "test3_SignIn" } )
    public void test5_SearchEmployee() {}

    @Test (dependsOnMethods = { "test2_OpenOrangeHRM", "test3_SignIn" } )
    public void test6_SearchCandidate() {}

    @Test (dependsOnMethods = { "test2_OpenOrangeHRM", "test3_SignIn" } )
    public void test7_SignOut() {}
}
