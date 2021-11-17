package com.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

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
        // wypełnienie "birthday-month"
        Select month = new Select(driver.findElement(By.name("birthday-month")));
        month.selectByVisibleText("February");
        // wypełnienie "birthday-year"
        Select year = new Select(driver.findElement(By.name("birthday-year")));
        year.selectByIndex(42);
        //uzupełnienie gender
        driver.findElement(By.xpath("//input[@value='M']")).click();
        //wypełnienie "phone"
        driver.findElement(By.xpath("//input[@name='phone']")).sendKeys(phone);
        //driver.findElement(By.name("phone")).sendKeys(phone);

        //rejestracja
        driver.findElement(By.id("rcmloginsubmit")).click();
        System.out.println("Rejestracja zakończona pomyślnie");


        //logowanie do poczty
        driver.get("https://selenium.waw.pl/roundcube");
        //podaj login
        driver.findElement(By.id("rcmloginuser")).sendKeys(user);
        //podaj hasło
        driver.findElement(By.id("rcmloginpwd")).sendKeys(password);

        //logowanie
        driver.findElement(By.id("rcmloginsubmit")).click();
        System.out.println("Logowanie zakończone pomyślnie");



        //utwórz nowy mail
        driver.findElement(By.xpath("//a[@title='Utwórz nową wiadomość']")).click();
        driver.findElement(By.id("_to")).sendKeys(user);
        driver.findElement(By.id("compose-subject")).sendKeys("wysyłka maila utomat");
        driver.findElement(By.id("composebody")).sendKeys("To jest wiadomość testowa.");
        driver.findElement(By.id("rcmbtn107")).click();
        }

    }
