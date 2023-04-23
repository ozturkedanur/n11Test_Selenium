import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailPage extends BasePage {

    //By addToCartButton = new By.ByCssSelector("Sepete Ekle");
    By addToCartButton = By.className("product-add-cart");

    public ProductDetailPage(WebDriver driver) {

        super(driver);
    }

    public boolean isOnProductDetailPage() {
        return display(addToCartButton);
    }

    public void addToCart() {

        click(addToCartButton);
    }
}
