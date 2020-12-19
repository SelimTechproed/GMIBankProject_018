package gmibank.com.utilities;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
public class JSExecutor {
    //elementi methodun icine yazdigimizda js bu elemnte tiklar.
    public static void clickElementByJS(WebElement element){
        JavascriptExecutor jsExecutor =((JavascriptExecutor)Driver.getDriver());
        jsExecutor.executeScript("arguments[0].click();", element);
    }
    //Sayfa basligini JS ile alma metodu
    public static String getTitleByJS(){
        JavascriptExecutor jsExecutor =((JavascriptExecutor)Driver.getDriver());
        String title = jsExecutor.executeScript("return document.title;").toString();
        return title;
    }
    //Scroll down (asagi kaydirma). bu metod sayfada en alt kisma kadar kaydirir.
    public static void scrollDownByJS(){
        JavascriptExecutor jsExecutor =((JavascriptExecutor)Driver.getDriver());
        jsExecutor.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }
    //JS ile bir elemente kadar kaydirma(scroll down)
    public static void scrollInToViewJS(WebElement element){
        JavascriptExecutor jsExecutor =((JavascriptExecutor)Driver.getDriver());
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);",element);
    }
    //secilen elementin background rengini degistirmek icin
    public static void flash(WebElement element) {
        String bgColor = element.getCssValue("backgroundcolor");
        for (int i = 0; i < 10; i++) {
            changeColor("rgb(0,200,0", element);
            changeColor(bgColor, element);
        }
    }
    // webelementin arkplan rengini değiştirir.
    // Mesala, websayfasını test ederken, hata aldınız ve aldığınız hatanın olduğu bölümün ekran görüntüsünü
    // kaydetmek istiyorsunuz. Ekran görüntüsü almadan önce, eğer arkaplan rengini değiştirirseniz,
    // böylece hataya vurgu yapmış olursunuz ve görüntüye bakan kişi hatayı direk görebilir.
    public static void changeColor(String color, WebElement element) {
        JavascriptExecutor javascriptExecutor = ((JavascriptExecutor) Driver.getDriver());
        javascriptExecutor.executeScript("arguments[0].style.backgroundColor = '" + color + "'", element);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    //Gerektiginde bir uyari(alert) olusturma
    public static void generateAlert(String message){
        JavascriptExecutor jsExecutor =((JavascriptExecutor)Driver.getDriver());
        jsExecutor.executeScript("alert('"+ message + "')");
    }
}