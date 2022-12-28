package com.cydeo.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TurkeyOutdoor {
    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        for (int i = 0; i <13 ; i++) {
            driver.get("https://turkeyoutdoor.org/hakkimizda/");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        driver.close();

        for (int i = 0; i <32 ; i++) {
            driver.get("https://turkeyoutdoor.org/gezi-rehberi/adana-gezi-rehberi-2/");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        driver.close();

        for (int i = 0; i <23 ; i++) {
            driver.get("https://turkeyoutdoor.org/2021/09/04/adana-tanitim/");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        driver.close();

        for (int i = 0; i <15 ; i++) {
            driver.get("https://turkeyoutdoor.org/2021/09/05/adanada-gezilecek-yerler/");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        driver.close();

        for (int i = 0; i <32 ; i++) {
            driver.get("https://turkeyoutdoor.org/2021/09/07/adanada-gezilecek-yerler-1/");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        driver.close();

        for (int i = 0; i <42 ; i++) {
            driver.get("https://turkeyoutdoor.org/2021/09/07/adanada-gezilecek-yerler-1/");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        driver.close();

        for (int i = 0; i <10 ; i++) {
            driver.get("https://turkeyoutdoor.org/2021/09/07/adanada-gezilecek-yerler-1/");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        driver.close();

        for (int i = 0; i <30 ; i++) {
            driver.get("https://turkeyoutdoor.org/2021/09/11/adanada-gezilecek-yerler-2/");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        driver.close();

        for (int i = 0; i <20 ; i++) {
            driver.get("https://turkeyoutdoor.org/2021/09/17/adanada-kultur-ve-sanat/");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        driver.close();
        for (int i = 0; i <20 ; i++) {
            driver.get("https://turkeyoutdoor.org/2021/09/21/adana-kamp-alanlari/");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        driver.close();
        for (int i = 0; i <25 ; i++) {
            driver.get("https://turkeyoutdoor.org/2021/09/24/adana-outdoor-ve-doga-aktiviteleri/");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        driver.close();
        for (int i = 0; i <30 ; i++) {
            driver.get("https://turkeyoutdoor.org/2021/09/25/adanada-ne-yenir/");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        driver.close();
        for (int i = 0; i <30 ; i++) {
            driver.get("https://turkeyoutdoor.org/gezi-rehberi/02-adiyaman-gezi-rehberi/");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        driver.close();
    }
}
