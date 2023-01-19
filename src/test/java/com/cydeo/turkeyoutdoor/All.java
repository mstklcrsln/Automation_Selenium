package com.cydeo.turkeyoutdoor;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class All {
    public static WebDriver driver;
    @BeforeMethod
    public void setupMethod (){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        driver.get("https://turkeyoutdoor.org");
    }

    @Test
    public void outdoor (){

            List<String> allPages = new ArrayList<>();
            for (int i = 1; i < 80; i++) {//Firstly, inspect your site, set the breakpoint of "i" based on the number of "href tags" on the page
                //This loop finds all href tags and store their values in allPages list
                String eachAddress = driver.findElement(By.xpath("(//a[@href])[" + i + "]")).getAttribute("href");
                allPages.add(eachAddress);
            }


            for (String each : allPages) {//This loop opens each link on a new tab
                JavascriptExecutor js = (JavascriptExecutor) driver;
                js.executeScript("window.open('" + each + "', '_blank');");
            }


            Set<String> AllHandles = driver.getWindowHandles();
            int count = 1;
            for (String eachHandle : AllHandles) {//Navigate each tab and get title/URL
                driver.switchTo().window(eachHandle);
                System.out.println(count + ". page title is : " + driver.getTitle() + "\n" +
                        count + ". link is: " + driver.getCurrentUrl());
                driver.switchTo().parentFrame();
                count++;
            }
        }
        @AfterMethod
    public void close(){
        driver.quit();
        }

    }
/*
1. page title is : Türkiye'nin Outdoor Sayfası -
1. link is: https://turkeyoutdoor.org/
2. page title is : Bahçe ve Peyzaj arşivleri - Türkiye'nin Outdoor Sayfası
2. link is: https://turkeyoutdoor.org/category/bahce-ve-peyzaj/
3. page title is : Türkiye'nin Outdoor Sayfası (@turkey_outdoor_org) • Instagram fotoğrafları ve videoları
3. link is: https://www.instagram.com/turkey_outdoor_org/
4. page title is : doğada sağlık arşivleri - Türkiye'nin Outdoor Sayfası
4. link is: https://turkeyoutdoor.org/category/dogada-saglik/
5. page title is : Doğa Sevgisi – Türkiye'nin Outdoor Sayfası
5. link is: https://turkeyoutdoor.org/category/doga-sevgisi/
6. page title is : Doğayı Koruyalım - Türkiye'nin Outdoor Sayfası
6. link is: https://turkeyoutdoor.org/dogayi-koruyalim/
7. page title is : Gezi/yorum - Türkiye'nin Outdoor Sayfası
7. link is: https://turkeyoutdoor.org/portfolio/gezi-yorum/
8. page title is : Bahçe ve Peyzaj arşivleri - Türkiye'nin Outdoor Sayfası
8. link is: https://turkeyoutdoor.org/category/bahce-ve-peyzaj/
9. page title is : Outdoor İletişim arşivleri - Türkiye'nin Outdoor Sayfası
9. link is: https://turkeyoutdoor.org/category/outdoor-iletisim/
10. page title is : Nerede Ne Yapılır? arşivleri - Türkiye'nin Outdoor Sayfası
10. link is: https://turkeyoutdoor.org/category/nerede-ne-yapilir/
11. page title is : Geçmiş Etkinlikler arşivleri - Türkiye'nin Outdoor Sayfası
11. link is: https://turkeyoutdoor.org/category/gecmis-etkinlikler/
12. page title is : www.turkeyoutdoor.org (@CarslanMesut) / Twitter
12. link is: https://twitter.com/CarslanMesut
13. page title is : Outdoor Aktivistleri arşivleri - Türkiye'nin Outdoor Sayfası
13. link is: https://turkeyoutdoor.org/category/outdoor-aktivistleri/
14. page title is : Outdoor Turizmi - Türkiye'nin Outdoor Sayfası
14. link is: https://turkeyoutdoor.org/outdoor-turizmi/
15. page title is : 07 Antalya Gezi Rehberi - Türkiye'nin Outdoor Sayfası
15. link is: https://turkeyoutdoor.org/gezi-rehberi/07-antalya-gezi-rehberi/
16. page title is : 06 Ankara Gezi Rehberi - Türkiye'nin Outdoor Sayfası
16. link is: https://turkeyoutdoor.org/gezi-rehberi/06-ankara-gezi-rehberi/
17. page title is : 05 Amasya Gezi Rehberi - Türkiye'nin Outdoor Sayfası
17. link is: https://turkeyoutdoor.org/gezi-rehberi/05-amasya-gezi-rehberi/
18. page title is : 04 Ağrı Gezi Rehberi - Türkiye'nin Outdoor Sayfası
18. link is: https://turkeyoutdoor.org/gezi-rehberi/agri-gezi-rehberi/
19. page title is : 03 Ayfon Gezi Rehberi - Türkiye'nin Outdoor Sayfası
19. link is: https://turkeyoutdoor.org/gezi-rehberi/03-ayfon-gezi-rehberi/
20. page title is : 02 Adıyaman Gezi Rehberi - Türkiye'nin Outdoor Sayfası
20. link is: https://turkeyoutdoor.org/gezi-rehberi/02-adiyaman-gezi-rehberi/
21. page title is : 01 Adana Gezi Rehberi - Türkiye'nin Outdoor Sayfası
21. link is: https://turkeyoutdoor.org/gezi-rehberi/adana-gezi-rehberi-2/
22. page title is : Türkiye Gezi Rehberi - Türkiye'nin Outdoor Sayfası
22. link is: https://turkeyoutdoor.org/gezi-rehberi/
23. page title is : Giyim, Ekipman, Applikasyon arşivleri - Türkiye'nin Outdoor Sayfası
23. link is: https://turkeyoutdoor.org/category/giyim-ekipman-applikasyon/
24. page title is : Outdoor Haber arşivleri - Türkiye'nin Outdoor Sayfası
24. link is: https://turkeyoutdoor.org/category/outdoor-haber/
25. page title is : Alıntı Yazılar arşivleri - Türkiye'nin Outdoor Sayfası
25. link is: https://turkeyoutdoor.org/category/alinti-yazilar/
26. page title is : Ekstrem Sporlar arşivleri - Türkiye'nin Outdoor Sayfası
26. link is: https://turkeyoutdoor.org/category/outdoor-aktiviteleri/ekstrem-sporlar/
27. page title is : dağcılık arşivleri - Türkiye'nin Outdoor Sayfası
27. link is: https://turkeyoutdoor.org/category/dagcilik/
28. page title is : Kampçılık arşivleri - Türkiye'nin Outdoor Sayfası
28. link is: https://turkeyoutdoor.org/category/kampcilik/
29. page title is : İletişim - Türkiye'nin Outdoor Sayfası
29. link is: https://turkeyoutdoor.org/contact/
30. page title is : Doğa Yürüyüşleri arşivleri - Türkiye'nin Outdoor Sayfası
30. link is: https://turkeyoutdoor.org/category/doga-yuruyusleri/
31. page title is : Outdoor Aktiviteleri arşivleri - Türkiye'nin Outdoor Sayfası
31. link is: https://turkeyoutdoor.org/category/outdoor-aktiviteleri/
32. page title is : Ekoloji arşivleri - Türkiye'nin Outdoor Sayfası
32. link is: https://turkeyoutdoor.org/category/ekoloji/
33. page title is : Outdoor - Türkiye'nin Outdoor Sayfası
33. link is: https://turkeyoutdoor.org/outdoor/
34. page title is : İklim Değişikliği – Türkiye'nin Outdoor Sayfası
34. link is: https://turkeyoutdoor.org/category/iklim-degisikligi/
35. page title is : Hakkımızda - Türkiye'nin Outdoor Sayfası
35. link is: https://turkeyoutdoor.org/hakkimizda/
36. page title is : Türkiye'nin Outdoor Sayfası -
36. link is: https://turkeyoutdoor.org/#
37. page title is : Türkiye'nin Outdoor Sayfası -
37. link is: https://turkeyoutdoor.org/
38. page title is : Türkiye'nin Outdoor Sayfası -
38. link is: https://turkeyoutdoor.org/
39. page title is : İletişim - Türkiye'nin Outdoor Sayfası
39. link is: https://turkeyoutdoor.org/contact/
40. page title is : Outdoor Yazıları arşivleri - Türkiye'nin Outdoor Sayfası
40. link is: https://turkeyoutdoor.org/category/outdoor-yazilari/
41. page title is : Gezi Rehberi arşivleri - Türkiye'nin Outdoor Sayfası
41. link is: https://turkeyoutdoor.org/category/gezi-rehberi/
42. page title is : Doğayı Koruyalım - Türkiye'nin Outdoor Sayfası
42. link is: https://turkeyoutdoor.org/dogayi-koruyalim/
43. page title is : Hakkımızda - Türkiye'nin Outdoor Sayfası
43. link is: https://turkeyoutdoor.org/hakkimizda/
44. page title is : Outdoor Turizmi - Türkiye'nin Outdoor Sayfası
44. link is: https://turkeyoutdoor.org/outdoor-turizmi/
45. page title is : Outdoor - Türkiye'nin Outdoor Sayfası
45. link is: https://turkeyoutdoor.org/outdoor/
46. page title is : Outdoor Sektörü arşivleri - Türkiye'nin Outdoor Sayfası
46. link is: https://turkeyoutdoor.org/category/outdoor-sektoru/
47. page title is : Türkiye'nin Outdoor Sayfası | Facebook
47. link is: https://www.facebook.com/turkeyoutdoorblog
48. page title is : Türkiye'nin Outdoor Sayfası Forum – Türkiye'nin Outdoor Sayfası
48. link is: https://turkeyoutdoor.org/community/
49. page title is : Türkiye'nin Outdoor Sayfası -
49. link is: https://turkeyoutdoor.org/#content
50. page title is : Türkiye Gezi Rehberi - Türkiye'nin Outdoor Sayfası
50. link is: https://turkeyoutdoor.org/gezi-rehberi/
51. page title is : Kampçılık arşivleri - Türkiye'nin Outdoor Sayfası
51. link is: https://turkeyoutdoor.org/category/kampcilik/
52. page title is : Doğayı Koruyalım - Türkiye'nin Outdoor Sayfası
52. link is: https://turkeyoutdoor.org/dogayi-koruyalim/
53. page title is : Antalya Köprülü Kanyon Tanıtımı - Türkiye'nin Outdoor Sayfası
53. link is: https://turkeyoutdoor.org/2022/09/15/antalya-koprulu-kanyon-tanitimi/
54. page title is : Gezi Rehberi arşivleri - Türkiye'nin Outdoor Sayfası
54. link is: https://turkeyoutdoor.org/category/gezi-rehberi/
55. page title is : Gezi Rehberi arşivleri - Türkiye'nin Outdoor Sayfası
55. link is: https://turkeyoutdoor.org/category/gezi-rehberi/
56. page title is : doğada sağlık arşivleri - Türkiye'nin Outdoor Sayfası
56. link is: https://turkeyoutdoor.org/category/dogada-saglik/
57. page title is : Türkiye'nin Outdoor Sayfası -
57. link is: https://turkeyoutdoor.org/
58. page title is : Ekstrem Spor / Rafting 1 - Türkiye'nin Outdoor Sayfası
58. link is: https://turkeyoutdoor.org/2022/09/15/ekstrem-spor-rafting-1/
59. page title is : Hakkımızda - Türkiye'nin Outdoor Sayfası
59. link is: https://turkeyoutdoor.org/hakkimizda/
60. page title is : Gezi Rehberi arşivleri - Türkiye'nin Outdoor Sayfası
60. link is: https://turkeyoutdoor.org/category/gezi-rehberi/
61. page title is : Outdoor Turizmi - Türkiye'nin Outdoor Sayfası
61. link is: https://turkeyoutdoor.org/outdoor-turizmi/
62. page title is : Finike Gökliman Plajı Kamp Alanı Tanıtımı - Türkiye'nin Outdoor Sayfası
62. link is: https://turkeyoutdoor.org/2022/09/09/finike-gokliman-plaji-kamp-alani-tanitimi/
63. page title is : Türkiye'nin Outdoor Sayfası -
63. link is: https://turkeyoutdoor.org/
64. page title is : Doğa Sevgisi – Türkiye'nin Outdoor Sayfası
64. link is: https://turkeyoutdoor.org/category/doga-sevgisi/
65. page title is : Ekstrem Spor / Rafting 1 - Türkiye'nin Outdoor Sayfası
65. link is: https://turkeyoutdoor.org/2022/09/15/ekstrem-spor-rafting-1/
66. page title is : Outdoor - Türkiye'nin Outdoor Sayfası
66. link is: https://turkeyoutdoor.org/outdoor/
67. page title is : Antalya Köprülü Kanyon Tanıtımı - Türkiye'nin Outdoor Sayfası
67. link is: https://turkeyoutdoor.org/2022/09/15/antalya-koprulu-kanyon-tanitimi/
68. page title is : Doğayı Koruyalım - Türkiye'nin Outdoor Sayfası
68. link is: https://turkeyoutdoor.org/dogayi-koruyalim/
69. page title is : Outdoor Sektörü arşivleri - Türkiye'nin Outdoor Sayfası
69. link is: https://turkeyoutdoor.org/category/outdoor-sektoru/
70. page title is : Türkiye'nin Outdoor Sayfası (@turkey_outdoor_org) • Instagram fotoğrafları ve videoları
70. link is: https://www.instagram.com/turkey_outdoor_org/
71. page title is : Ekstrem Sporlar arşivleri - Türkiye'nin Outdoor Sayfası
71. link is: https://turkeyoutdoor.org/category/outdoor-aktiviteleri/ekstrem-sporlar/
72. page title is : Türkiye'nin Outdoor Sayfası Forum – Türkiye'nin Outdoor Sayfası
72. link is: https://turkeyoutdoor.org/community/
73. page title is : Finike Gökliman Plajı Kamp Alanı Tanıtımı - Türkiye'nin Outdoor Sayfası
73. link is: https://turkeyoutdoor.org/2022/09/09/finike-gokliman-plaji-kamp-alani-tanitimi/
74. page title is : Alıntı Yazılar arşivleri - Türkiye'nin Outdoor Sayfası
74. link is: https://turkeyoutdoor.org/category/alinti-yazilar/
75. page title is : Kampçılık arşivleri - Türkiye'nin Outdoor Sayfası
75. link is: https://turkeyoutdoor.org/category/kampcilik/
76. page title is : İklim Değişikliği – Türkiye'nin Outdoor Sayfası
76. link is: https://turkeyoutdoor.org/category/iklim-degisikligi/
77. page title is : twitter.com
77. link is: https://twitter.com/CarslanMesut
78. page title is : Türkiye'nin Outdoor Sayfası -
78. link is: https://turkeyoutdoor.org/#content
79. page title is : Antalya Köprülü Kanyon Tanıtımı - Türkiye'nin Outdoor Sayfası
79. link is: https://turkeyoutdoor.org/2022/09/15/antalya-koprulu-kanyon-tanitimi/
80. page title is : Türkiye Gezi Rehberi - Türkiye'nin Outdoor Sayfası
80. link is: https://turkeyoutdoor.org/gezi-rehberi/

 */


