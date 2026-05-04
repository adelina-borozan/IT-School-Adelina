package PageFactory;

import baseTest.BaseTest;
import org.testng.annotations.Test;
import pageFactory.CheckboxesPage;
import pageFactory.DropdownPage;

public class HerokuAppTests extends BaseTest {

    @Test
    public void checkboxesTest(){
        CheckboxesPage checkboxesPage = new CheckboxesPage(driver);
        checkboxesPage.clickCheckbox1();
        checkboxesPage.clickCheckbox2();
    }

    @Test
    public void dropdownTest(){
        DropdownPage dropdownPage = new DropdownPage(driver);
        dropdownPage.selectOptionFromDropdown("Option 1");
        dropdownPage.selectOptionFromDropdown("Option 2");
    }
}
