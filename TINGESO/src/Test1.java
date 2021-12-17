
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.*;
import java.util.concurrent.TimeUnit;

public class Test1{
    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;
    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
    }
    @After
    public void tearDown() throws InterruptedException {
        TimeUnit.SECONDS.sleep(5);
        driver.quit();
    }
    // ENCONTRAR UN ARTICULO DE LA TIENDA FILTRANDO EN BUSQUEDA
    @Test
    public void a() throws InterruptedException {
        driver.get("http://automationpractice.com/index.php");
        try {
            Thread.sleep(1000);
        }
        catch(InterruptedException e) {
            e.printStackTrace();
        }
        driver.manage().window().setSize(new Dimension(1552, 832));
        try {
            Thread.sleep(1000);
        }
        catch(InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.id("search_query_top")).click();
        try {
            Thread.sleep(1000);
        }
        catch(InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.id("search_query_top")).sendKeys("blou");
        try {
            Thread.sleep(1000);
        }
        catch(InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.id("search_query_top")).sendKeys(Keys.ENTER);
        try {
            Thread.sleep(1000);
        }
        catch(InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Test
<<<<<<< Updated upstream
    public void untitled() {

    }
}
=======

    public void b() {
        driver.get("http://automationpractice.com/index.php");
        try {
            Thread.sleep(1000);
        }
        catch(InterruptedException e) {
            e.printStackTrace();
        }
        driver.manage().window().setSize(new Dimension(1552, 832));
        try {
            Thread.sleep(1000);
        }
        catch(InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.cssSelector("#homefeatured > .ajax_block_product:nth-child(6) .button:nth-child(2) > span")).click();
        try {
            Thread.sleep(1000);
        }
        catch(InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.id("thumb_17")).click();
        try {
            Thread.sleep(1000);
        }
        catch(InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.cssSelector(".fancybox-item")).click();
        try {
            Thread.sleep(1000);
        }
        catch(InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.id("thumb_19")).click();
        try {
            Thread.sleep(1000);
        }
        catch(InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.cssSelector(".fancybox-item")).click();
    }


}


>>>>>>> Stashed changes
