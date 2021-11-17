package com.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Roundcube
    {
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
        }
    }
