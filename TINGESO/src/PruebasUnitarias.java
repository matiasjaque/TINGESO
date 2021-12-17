import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import static org.junit.Assert.assertEquals;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.*;

public class PruebasUnitarias {
    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;
    @Before
    public void setUp() {
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
    }
    @After
    public void tearDown() {
        driver.quit();
    }
    @Test
    public void contacto() {
        driver.get("http://automationpractice.com/index.php");
        driver.findElement(By.linkText("Contact us")).click();
        try {
            Thread.sleep(1000);
        }catch(InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.id("id_contact")).click();
        {
            WebElement dropdown = driver.findElement(By.id("id_contact"));
            dropdown.findElement(By.xpath("//option[. = 'Customer service']")).click();
        }
        driver.findElement(By.id("email")).click();
        try {
            Thread.sleep(1000);
        }catch(InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.id("email")).sendKeys("Test@mail.com");
        try {
            Thread.sleep(1000);
        }catch(InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.id("id_order")).click();
        try {
            Thread.sleep(1000);
        }catch(InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.id("id_order")).sendKeys("test de error");
        try {
            Thread.sleep(1000);
        }catch(InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.id("message")).click();
        try {
            Thread.sleep(1000);
        }catch(InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.id("message")).sendKeys("Probando test automatizados.");
        try {
            Thread.sleep(1000);
        }catch(InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.cssSelector("#submitMessage > span")).click();
        try {
            Thread.sleep(1000);
        }catch(InterruptedException e) {
            e.printStackTrace();
        }
        driver.close();
    }

    @Test
    public void ingresar() {
        driver.get("http://automationpractice.com/index.php");
        driver.findElement(By.linkText("Sign in")).click();
        try {
            Thread.sleep(1000);
        }catch(InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.cssSelector(".form_content > .form-group:nth-child(1)")).click();
        try {
            Thread.sleep(1000);
        }catch(InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.id("email")).click();
        driver.findElement(By.id("email")).sendKeys("MisPruebas@gmail.com");
        try {
            Thread.sleep(1000);
        }catch(InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.id("passwd")).sendKeys("PruebasUnitarias");
        driver.findElement(By.cssSelector("#SubmitLogin > span")).click();
        try {
            Thread.sleep(1000);
        }catch(InterruptedException e) {
            e.printStackTrace();
        }
        driver.close();
    }
    @Test
    public void salir() {
        driver.get("http://automationpractice.com/index.php");
        driver.findElement(By.linkText("Sign in")).click();
        driver.findElement(By.cssSelector(".form_content > .form-group:nth-child(1)")).click();
        driver.findElement(By.id("email")).click();
        driver.findElement(By.id("email")).sendKeys("MisPruebas@gmail.com");
        driver.findElement(By.id("passwd")).sendKeys("PruebasUnitarias");
        driver.findElement(By.cssSelector("#SubmitLogin > span")).click();
        driver.findElement(By.linkText("Sign out")).click();
        try {
            Thread.sleep(1000);
        }catch(InterruptedException e) {
            e.printStackTrace();
        }
        String resultado = driver.findElement(By.linkText("Sign in")).getText();
        try {
            Thread.sleep(1000);
        }catch(InterruptedException e) {
            e.printStackTrace();
        }
        assertEquals("Sign in", resultado);
        driver.close();
    }
    @Test
    public void agregarYeliminar() {
        driver.get("http://automationpractice.com/index.php");
        driver.findElement(By.cssSelector("#homefeatured > .ajax_block_product:nth-child(5) .button:nth-child(2) > span")).click();
        driver.findElement(By.id("color_13")).click();
        driver.findElement(By.cssSelector(".exclusive > span")).click();
        try {
            Thread.sleep(5000);
        }catch(InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.cssSelector(".button-medium > span")).click();
        driver.findElement(By.cssSelector(".icon-trash")).click();
        try {
            Thread.sleep(5000);
        }catch(InterruptedException e) {
            e.printStackTrace();
        }
        String resultado = driver.findElement(By.xpath("//p[@class='alert alert-warning']")).getText();
        assertEquals("Your shopping cart is empty.", resultado);
        driver.close();
    }
    @Test
    public void obtenerTitulo() {
            driver.get("http://automationpractice.com/index.php");
            String titulo  = driver.getTitle();
            assertEquals("My Store", titulo);
    }
    @Test
    public void volverAhome() {
        driver.get("http://automationpractice.com/index.php");
        driver.findElement(By.linkText("Sign in")).click();
        driver.findElement(By.id("email")).click();
        driver.findElement(By.id("email")).sendKeys("MisPruebas@gmail.com");
        driver.findElement(By.id("passwd")).sendKeys("PruebasUnitarias");
        try {
            Thread.sleep(5000);
        }catch(InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.cssSelector("#SubmitLogin > span")).click();
        try {
            Thread.sleep(5000);
        }catch(InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.cssSelector(".col-xs-12:nth-child(1) > .myaccount-link-list > li:nth-child(1) span")).click();
        try {
            Thread.sleep(5000);
        }catch(InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.cssSelector("li:nth-child(2) > .btn > span")).click();
        driver.close();
    }


}
