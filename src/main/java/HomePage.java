import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    SearchBox searchBox;
    By cartCount = new By.ByCssSelector("basketTotalNum");
    By cartIcon = By.className("myBasketHolder");


    public HomePage(WebDriver driver) {
        super(driver);
        searchBox = new SearchBox(driver);
    }

    public SearchBox searchBox(){
        return this.searchBox;
    }

    public boolean isProductCountUp() {
        return  getCartCount() > 0;
    }

    public void gotToCart() {
        click(cartIcon);
    }

    private int getCartCount(){
        String count = find(cartCount).getText();
        return Integer.parseInt(count);

    }
}
