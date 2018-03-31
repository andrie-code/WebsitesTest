/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package websitestest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.*;

/**
 *
 * @author User
 */
public class WebsitesTest {
    
    public WebsitesTest() {
        test();
    }
    
    /**
     * @param args the command line arguments
     */
    public void test() {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\Documents\\NetBeansProjects\\WebsitesTest\\libs\\geckodriver.exe");
        WebDriver webDriver = new FirefoxDriver();
    
        webDriver.get("https://stackoverflow.com/");
        System.out.println(webDriver.getCurrentUrl());
        
        webDriver.findElement(By.id("nav-questions")).click();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new WebsitesTest();
    }
    
}
