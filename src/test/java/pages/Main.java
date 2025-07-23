package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.openLoginPage();
        loginPage.login("standard_user", "secret_sauce");

        if (loginPage.isOnInventoryPage()) {
            System.out.println("Login success ✅");
        } else {
            System.out.println("Login failed ❌");
        }

        driver.quit();
    }
}
