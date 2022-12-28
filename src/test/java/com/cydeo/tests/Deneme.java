package com.cydeo.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Deneme {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        for (int i = 0; i <111 ; i++) {
            if (i<=10){
                driver.get("https://turkeyoutdoor.org/2022/09/15/antalya-koprulu-kanyon-tanitimi/\"");
                Thread.sleep(5000);
            } else if (i<=20) {
                driver.get("https://turkeyoutdoor.org/hakkimizda/");
                Thread.sleep(5000);
            } else if (i<=30) {
                driver.get("https://turkeyoutdoor.org/gezi-rehberi/adana-gezi-rehberi-2/");
                Thread.sleep(5000);
            } else if (i<=40) {
                driver.get("https://turkeyoutdoor.org/2021/09/04/adana-tanitim/");
                Thread.sleep(5000);
            }else if (i<=50) {
                driver.get("https://turkeyoutdoor.org/2021/09/05/adanada-gezilecek-yerler/");
                Thread.sleep(5000);
            }else if (i<=60) {
                driver.get("https://turkeyoutdoor.org/2021/09/07/adanada-gezilecek-yerler-1/");
                Thread.sleep(5000);
            }else if (i<=70) {
                driver.get("https://turkeyoutdoor.org/2021/09/17/adanada-kultur-ve-sanat/");
                Thread.sleep(5000);
            }else if (i<=80) {
                driver.get("https://turkeyoutdoor.org/2021/09/21/adana-kamp-alanlari/");
                Thread.sleep(5000);
            }else if (i<=90) {
                driver.get("https://turkeyoutdoor.org/gezi-rehberi/adana-gezi-rehberi-2/");
                Thread.sleep(5000);
            }else if (i<=100) {
                driver.get("https://turkeyoutdoor.org/2021/09/24/adana-outdoor-ve-doga-aktiviteleri/");
                Thread.sleep(5000);
            }else if (i<=110) {
                driver.get("https://turkeyoutdoor.org/2021/09/25/adanada-ne-yenir/");
                Thread.sleep(5000);
            }
        }
        driver.close();
}}

