package testngDemo.data_provider.with_separate_data_class;

import org.testng.annotations.Test;

public class DBClass {
    // it will take the data as separate entries from  DBdata class
    @Test(dataProviderClass = DBData.class ,dataProvider = "login_Provider")
    public void logIn (String email, String password, boolean success)
    {
        System.out.println("Log In Credentials: " + "\n" +
                "  Email = " + email + "\n" +
                "  Password = " + password + "\n" +
                "  Successful Log In = " + success + "\n" );
    }
}
