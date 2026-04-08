import org.testng.annotations.Test;

public class Priorities {

    @Test(priority = 0)
    public void openHomePage(){

    }

    @Test(priority = 1)
    public void verifyTitle(){

    }

    @Test(priority = 2)
    public void verifyLoginButton(){

    }

    @Test(priority = 4)
    public void verifyFooter(){

    }

}
