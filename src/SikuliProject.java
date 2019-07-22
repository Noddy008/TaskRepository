import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class SikuliProject {

    public static void main(String[] args) throws  Exception {

        System.out.println("Hi");
        System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\SikuliImages\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        Screen screen=new Screen();
        driver.get("https://gmail.com");
        Thread.sleep(3000);
        Pattern pattern=new Pattern("C:\\Users\\user\\Downloads\\SikuliImages");
        screen.click();
    }
}
