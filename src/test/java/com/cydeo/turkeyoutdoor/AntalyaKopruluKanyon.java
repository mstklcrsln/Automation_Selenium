package com.cydeo.turkeyoutdoor;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AntalyaKopruluKanyon  {
    public static void main(String[] args) {

        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();

        for (int i = 0; i <200 ; i++) {
            if (i<10) {
                driver.get("http://www.turkeyoutdoor.org/");

            } else if (i<20) {
                driver.get("https://turkeyoutdoor.org/hakkimizda/");

            }else if (i<45) {
                driver.get("https://turkeyoutdoor.org/2021/09/25/adanada-ne-yenir/");

            }else if (i<52) {
                driver.get("https://turkeyoutdoor.org/2022/09/15/antalya-koprulu-kanyon-tanitimi/#koprulu-kanyon-nerede");
                try {
                    Thread.sleep(7000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }else if (i<66) {
                driver.get("https://turkeyoutdoor.org/2022/09/15/antalya-koprulu-kanyon-tanitimi/#koprulu-kanyon-milli-parki-antalya");
                try {
                    Thread.sleep(6000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }else if (i<75) {
                driver.get("https://turkeyoutdoor.org/2022/09/15/antalya-koprulu-kanyon-tanitimi/#koprulu-kanyon-hakkinda");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }else if (i<83) {
                driver.get("https://turkeyoutdoor.org/2022/09/15/antalya-koprulu-kanyon-tanitimi/#koprulu-kanyon-milli-parki-nin-onemli-yerleri");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }else if (i<90) {
                driver.get("https://turkeyoutdoor.org/2022/09/15/antalya-koprulu-kanyon-tanitimi/#koprulu-kanyon-tarihi-oluk-kopru");
                try {
                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }else if (i<99) {
                driver.get("https://turkeyoutdoor.org/2022/09/15/antalya-koprulu-kanyon-tanitimi/#koprulu-kanyon-st-paul-yolu");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }else if (i<106) {
                driver.get("https://turkeyoutdoor.org/2022/09/15/antalya-koprulu-kanyon-tanitimi/#koprulu-kanyon-nasil-bir-yer");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }else if (i<109) {
                driver.get("https://turkeyoutdoor.org/2022/09/15/antalya-koprulu-kanyon-tanitimi/#koprulu-kanyon-gezisinde-ne-yapilir");
                try {
                    Thread.sleep(9000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }else if (i<120) {
                driver.get("https://turkeyoutdoor.org/2022/09/15/antalya-koprulu-kanyon-tanitimi/#koprulu-kanyon-kac-km");
                try {
                    Thread.sleep(8000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }else if (i<129) {
                driver.get("https://turkeyoutdoor.org/2022/09/15/antalya-koprulu-kanyon-tanitimi/#koprulu-kanyon-bitki-ortusu-flora");
                try {
                    Thread.sleep(7000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }else if (i<130) {
                driver.get("https://turkeyoutdoor.org/2022/09/15/antalya-koprulu-kanyon-tanitimi/#koprulu-kanyon-vahsi-yasam-fauna");
                try {
                    Thread.sleep(6000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }else if (i<139) {
                driver.get("https://turkeyoutdoor.org/2022/09/15/antalya-koprulu-kanyon-tanitimi/#koprulu-kanyon-outdoor-potansiyeli");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }else if (i<145) {
                driver.get("https://turkeyoutdoor.org/2022/09/15/antalya-koprulu-kanyon-tanitimi/#koprulu-kanyon-yol-tarifi");
                try {
                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }else if (i<155) {
                driver.get("https://turkeyoutdoor.org/2022/09/15/antalya-koprulu-kanyon-tanitimi/#koprulu-kanyon-ucretli-kamp");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }else if (i<163) {
                driver.get("https://turkeyoutdoor.org/2022/09/15/antalya-koprulu-kanyon-tanitimi/#koprulu-kanyon-ucretsiz-kamp");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }else if (i<169) {
                driver.get("https://turkeyoutdoor.org/2022/09/15/antalya-koprulu-kanyon-tanitimi/#koprulu-kanyon-kamp-olanaklari");
                try {
                    Thread.sleep(9000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }else if (i<179) {
                driver.get("https://turkeyoutdoor.org/2022/09/15/antalya-koprulu-kanyon-tanitimi/#koprulu-kanyonda-rafting-ucreti");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }else if (i<186) {
                driver.get("https://turkeyoutdoor.org/2022/09/15/antalya-koprulu-kanyon-tanitimi/#koprulu-kanyon-rafting-tesisleri");
                try {
                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }else if (i<200) {
                driver.get("https://turkeyoutdoor.org/2022/09/15/antalya-koprulu-kanyon-tanitimi/#antalya-koprulu-kanyon-rafting");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            driver.close();

        }
    }
}
