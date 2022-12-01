package DemoWebshop;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TricentisWebshop {
    static WebDriver driver;

    public void urlPage() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\DEENARAY\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
        driver = new ChromeDriver();
//        Thread.sleep(3000);
        driver.manage().window().maximize();
        driver.get("https://demowebshop.tricentis.com/");
    }

    public void login() {
        driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
        driver.findElement(By.xpath("//input[@id=\"Email\"]")).sendKeys("anichotu1504@gmail.com");
        driver.findElement(By.xpath("//input[@id=\"Password\"]")).sendKeys("123456789");
        driver.findElement(By.xpath("//input[@id=\"RememberMe\"]")).click();
        try {
            driver.findElement(By.xpath("//input[@value=\"Log in\"]")).click();
        }
           catch (NoSuchElementException e){
            System.out.println("Element not found");
            e.printStackTrace();
 }
    }

    public void computer() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[1]/div[1]/div[2]/ul/li[2]/a")).click();
        driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[1]/div[2]/div")).click();
        driver.findElement(By.xpath("//input[@value=\"Add to cart\"]")).click();
        Thread.sleep(2000);
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("window.scrollBy(0,-500)", "");
        driver.findElement(By.xpath("//span[text()=\"Shopping cart\"]")).click();
        driver.findElement(By.xpath("//input[@id=\"termsofservice\"]")).click();
        driver.findElement(By.xpath("//button[@id=\"checkout\"]")).click();

    }

    public void Billingaddress() throws InterruptedException {
        // WebElement country =;

        Select select = new Select(driver.findElement(By.id("BillingNewAddress_CountryId")));
        select.selectByIndex(2);

        driver.findElement(By.xpath("//input[@id=\"BillingNewAddress_City\"]")).sendKeys("Bangalore");
        driver.findElement(By.xpath("//input[@id=\"BillingNewAddress_Address1\"]")).sendKeys("DTP Whitefield");
        driver.findElement(By.xpath("//input[@id=\"BillingNewAddress_ZipPostalCode\"]")).sendKeys("560076");
        driver.findElement(By.xpath("//input[@id=\"BillingNewAddress_PhoneNumber\"]")).sendKeys("1234567890");
        try {
            driver.findElement(By.xpath("//div[@id='checkout-step-billing']/div/input[@title='Continue']")).click();
        }
        catch (ElementClickInterceptedException h)
        {
            System.out.println("Element intercepted");
        }
        //        button.click();Thread.sleep(3000);

    }
    public void shippingAddress() throws InterruptedException {
    driver.findElement(By.xpath("//*[@id=\"shipping-buttons-container\"]/input")).click();
    Thread.sleep(3000);
}
public void shippingMethod() throws InterruptedException {
    driver.findElement(By.xpath("//input[@class=\"button-1 shipping-method-next-step-button\"]")).click();
    Thread.sleep(3000);
}
public void paymentMethod() throws InterruptedException {
    driver.findElement(By.xpath("//input[@class=\"button-1 payment-method-next-step-button\"]")).click();
    Thread.sleep(3000);
}
public void paymentInformation() throws InterruptedException {
    driver.findElement(By.xpath("//input[@class=\"button-1 payment-info-next-step-button\"]")).click();
    Thread.sleep(3000);
}
public void orderConfirmation() throws InterruptedException {
    driver.findElement(By.xpath("//input[@class=\"button-1 confirm-order-next-step-button\"]")).click();
    Thread.sleep(3000);
}

    }
