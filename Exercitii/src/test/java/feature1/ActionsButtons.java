package feature1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class ActionsButtons {

    @Test
    public void test1(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/checkbox");

        WebElement doubleClickMeButton = driver.findElement(By.className("rc-tree-checkbox"));

        doubleClickMeButton.click();




        driver.findElement(By.id("userName"));
        driver.findElement(By.xpath("//input[@id='userName']"));

    }

    @Test
    public void test(){
        WebDriver driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demoqa.com/buttons");

        WebElement doubleClickMeButton = driver.findElement(By.id("doubleClickBtn"));
        WebElement rightClickMeButton = driver.findElement(By.id("rightClickBtn"));


        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));//        wait.until(rightClickMeButton.isEnabled());

//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("rightClickBtn")));



        Actions actions = new Actions(driver);
        actions.doubleClick(doubleClickMeButton).perform();

        WebElement outputMessageDoubleClick = driver.findElement(By.id("doubleClickMessage"));
        Assert.assertTrue(outputMessageDoubleClick.isDisplayed());


        actions.contextClick(rightClickMeButton).perform();

        WebElement outputMessageRightClick = driver.findElement(By.id("rightClickMessage"));
        Assert.assertTrue(outputMessageRightClick.isDisplayed());

        WebElement clickMeButton = driver.findElement(By.xpath("//*[text()='Click Me']"));
        clickMeButton.click();

        WebElement outputMessageClick = driver.findElement(By.id("dynamicClickMessage"));
        Assert.assertTrue(outputMessageClick.isDisplayed());
    }
}
