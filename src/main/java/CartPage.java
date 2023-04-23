import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import javax.xml.bind.Unmarshaller;
import java.util.List;

public class CartPage extends BasePage {

    By productInCart = new By.ByCssSelector("prodDescription");

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public boolean checkProductAdded() {
        return getMyProducts().size() > 0;
    }

    private List<WebElement> getMyProducts(){
        return findAll(productInCart);
    }
}
