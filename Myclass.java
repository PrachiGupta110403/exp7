import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTests {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "/home/computer/Desktop/prachi/selenium-tests");

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        // Launch the browser and open a webpage
        driver.get("https://com.example.com");

        // Perform actions on the webpage
        // For example, find an element and click it
        // driver.findElement(By.id("elementId")).click();

        // Perform assertions to verify the expected behavior
        // For example, assert that the page title is as expected
        // assert driver.getTitle().equals("Expected Page Title");

        // Close the browser
        driver.quit();
    }
}

