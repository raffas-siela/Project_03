package com.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Roundcube
    {
        String login = "sm1017";
        String password = "sm1017";
        String phone = "060317090814";
        String user = login + "@selenium.waw.pl";

        public void CreateNewUser()
        {
        //ścieżka do chromedriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rafał\\Desktop\\auto\\chromedriver\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        System.out.println("Startujemy RoundCube");
        //otwieramy stronę z adresem
        driver.get("https://selenium.waw.pl/");
        //maksymalizacja okna przeglądarki
        driver.manage().window().maximize();
        //pole "nazwa"
        driver.findElement(By.id("rcmloginuser")).sendKeys(login);
        //pole "hasło"
        driver.findElement(By.id("password")).sendKeys(password);
        //pole "powtórz hasło"
        driver.findElement(By.id("confirm_password")).sendKeys(password);
        // wypełnienie "birthday-day"
        driver.findElement(By.name("birthday-day")).sendKeys("25");
        }
    }
