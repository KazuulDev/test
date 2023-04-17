package mainPage;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Page {
     public static final String URL = "https://qa-scooter.praktikum-services.ru/";

     SelenideElement yaLogo = $(By.id("Yandex"));
     //логотип
     SelenideElement scooterLogo = $(By.id("Scooter"));
     //самокат

}
