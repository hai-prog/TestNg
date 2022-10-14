package testngDemo.data_provider.with_separate_data_class;

import org.testng.annotations.DataProvider;
// data provider using separate data class
public class DBData {
    @DataProvider(name = "login_Provider")
    public static Object [] [] logInData ()
    {
        Object [][] data = new Object [3][3];

        data [0][0] = "TestNG@Framework.com";		data [0][1] = "TestNG1234";		data [0][2] = true;
        data [1][0] = "Joe@Doe.com";			data [1][1] = "DoeDoe34";		data [1][2] = false;
        data [2][0] = "Test@AutomationU.com";		data [2][1] = "TAU1234";		data [2][2] = true;

        return data;
    }
}
