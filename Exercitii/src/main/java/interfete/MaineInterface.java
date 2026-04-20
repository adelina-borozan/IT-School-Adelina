package interfete;

public class MaineInterface {

    public static void main(String []args) {
        LoginPage loginPage = new LoginPage();

        loginPage.enterUsername("adelina");

        loginPage.enterPassword("parola");

        loginPage.clickLogin();
    }
}
