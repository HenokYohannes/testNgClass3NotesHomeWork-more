package class3;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utlis.CommonMethods;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class HomeWork extends CommonMethods {

/*Open chrome browser
Go to HRMS
Login into the application
Add 5 different Employees and create login credentials by providing:
First Name
Last Name
Username
Password
Verify Employee has been added successfully and take screenshot (you must have 5 different screenshots)
Close the browser
Specify group for this test case, add it into specific suite and execute from xml file.
 */

    @Test(groups="addemployee",dataProvider = "emp")
    public void NewEmployee(String firstname,String lastname,String userName,String pass,String confirm) throws InterruptedException {
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
        driver.findElement(By.id("btnLogin")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("menu_pim_viewPimModule")).click();
        driver.findElement(By.id("btnAdd")).click();
        driver.findElement(By.id("firstName")).sendKeys(firstname);
        driver.findElement(By.id("lastName")).sendKeys(lastname);
        driver.findElement(By.id("chkLogin")).click();
        driver.findElement(By.id("user_name")).sendKeys(userName);
        driver.findElement(By.id("user_password")).sendKeys(pass);
        driver.findElement(By.id("re_password")).sendKeys(confirm);
        Thread.sleep(1000);
        driver.findElement(By.id("btnSave")).click();

    }
    /*
        @Test(priority = 2, dependsOnMethods = "emp", groups = "addemployee")
        public void screenShot() throws IOException {
            TakesScreenshot ts = (TakesScreenshot) driver;
            File sourceFile = ts.getScreenshotAs(OutputType.FILE);
            try{
            FileUtils.copyFile(sourceFile, new File("screenshots/TestNg/HomeWork_TestNg/HW_Class03.png"));
        }catch (IOException e){
                e.printStackTrace();
            }}
    */
    @DataProvider
    public Object[][] emp (){
        Object[][] addEmp =new Object[5][5];
        addEmp[0][0]="Sky";
        addEmp[0][1]="Heaven";
        addEmp[0][2]="sky";
        addEmp[0][3]="skyH@gmail.com";
        addEmp[0][4]="skyH@gmail.com";
        addEmp[1][0]="Sami";
        addEmp[1][1]="Russ";
        addEmp[1][2]="Sami";
        addEmp[1][3]="sami@gmx.com";
        addEmp[1][4]="sami@gmx.com";
        addEmp[2][0]="Music";
        addEmp[2][1]="Zit";
        addEmp[2][2]="Music";
        addEmp[2][3]="music@gmx.com";
        addEmp[2][4]="music@gmx.com";
        addEmp[3][0]="Kes";
        addEmp[3][1]="Russo";
        addEmp[3][2]="Kesuu";
        addEmp[3][3]="kes@gmail.com";
        addEmp[3][4]="kes@gmail.com";
        addEmp[4][0]="Rob";
        addEmp[4][1]="Russ";
        addEmp[4][2]="Robi";
        addEmp[4][3]="robi@gmail.com";
        addEmp[4][4]="robi@gmail.com";
        return addEmp;

    }

}