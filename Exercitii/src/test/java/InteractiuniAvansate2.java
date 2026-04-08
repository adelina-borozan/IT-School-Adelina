import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class InteractiuniAvansate2 {

    WebDriver driver;

    @Test
    public void testDropdownSelect(){
        driver = new ChromeDriver();

        driver.get("https://demoqa.com/select-menu");

        //selecteaza culoarea Blue
        WebElement selectDropdownLocator = driver.findElement(By.id("oldSelectMenu"));
        Select dropdown = new Select(selectDropdownLocator);

        dropdown.selectByVisibleText("Blue");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //selecteaza culoarea Yellow folosind value
        dropdown.selectByValue("3");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //selecteaza culoarea Purple folosind index
        dropdown.selectByIndex(4);

        String selectedOptionText = dropdown.getFirstSelectedOption().getText();
        Assert.assertEquals(selectedOptionText, "Purple", "Optiunea selectata nu este Purple");
    }

    @Test
    public void dropdownNew() {
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/select-menu");

        WebElement dropdown = driver.findElement(By.className("css-13cymwt-control"));

        dropdown.click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

//        WebElement option1 = driver.findElement(By.xpath("//div[text()='Group 1, option 1']"));
//
//        option1.click();

        WebElement option1 = driver.findElement(By.id("react-select-2-option-0-0"));
        option1.click();
    }


    @Test
    public void testCheckbox() {
        driver = new ChromeDriver();
        driver.get("https://practicesoftwaretesting.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.manage().window().maximize();


        WebElement checkbox = driver.findElement(By.xpath("//label[contains(text(), 'MightyCraft Hardware')]/input"));

        checkbox.click();

        checkbox.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));

        wait.until(ExpectedConditions.elementSelectionStateToBe(checkbox, false));


        //verificare checkbox is selected
        boolean ischeckboxSelected = checkbox.isSelected();

        if(ischeckboxSelected == true) {
            System.out.println("este selectat, nu mai trebuie dat click");
        } else {
            System.out.println("nu este selectat, da click");
            checkbox.click();
        }

        ischeckboxSelected = checkbox.isSelected();

        Assert.assertTrue(ischeckboxSelected, "nu este selectat");
    }

    @Test
    public void testRadioButton(){
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/radio-button");

        WebElement yesRadioButton = driver.findElement(By.id("yesRadio"));

        WebElement impressiveRadioButton = driver.findElement(By.id("impressiveRadio"));

        yesRadioButton.click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        impressiveRadioButton.click();
    }


    @Test
    public void testUpload() {
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/upload-download");

        WebElement uploadInput = driver.findElement(By.id("uploadFile"));

        uploadInput.sendKeys("C:\\Users\\adeli\\Desktop\\upload.txt.txt");

    }

    @Test
    public void testButtons() {
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/buttons");

        WebElement doubleClickBtn = driver.findElement(By.id("doubleClickBtn"));

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Actions actiuni = new Actions(driver);

        actiuni.doubleClick(doubleClickBtn).perform();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement rightClickBtn = driver.findElement(By.id("rightClickBtn"));

        actiuni.contextClick(rightClickBtn).perform();
    }
}
