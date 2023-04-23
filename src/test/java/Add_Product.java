import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;


public class Add_Product extends BaseTest {


    HomePage homePage;
    ProductsPage productsPage;
    ProductDetailPage productDetailPage;
    CartPage cartPage;

    @Test
    @Order(1)
    public void search() throws InterruptedException {
        homePage = new HomePage(driver);
        productsPage = new ProductsPage(driver);
        homePage.searchBox().search("kitap");
        //Assertions.assertTrue(productsPage.isOnProductPage() , "NOT ON PRODUCTS PAGE");
        Thread.sleep(10);
    }

    @Test
    @Order(2)
    public void select() throws InterruptedException {
        productDetailPage = new ProductDetailPage(driver);
        productsPage.selectProduct(3);
        Assertions.assertTrue(productDetailPage.isOnProductDetailPage() , "NOT ON PRODUCT DETAIL PAGE");
        Thread.sleep(10);
    }

    @Test
    @Order(3)
    public void add_to_cart() throws InterruptedException {
        Thread.sleep(10);
        productDetailPage.addToCart();
        //Assertions.assertTrue(homePage.isProductCountUp() , "PRODUCT DID NOT ADDED");
        Thread.sleep(10);
    }

    @Test
    @Order(4)
    public void go_to_cart() throws InterruptedException {
        Thread.sleep(10);
        cartPage = new CartPage(driver);
        homePage.gotToCart();
        Assertions.assertTrue(cartPage.checkProductAdded() , "PRODUCT WAS NOT ADDED");

    }
}
