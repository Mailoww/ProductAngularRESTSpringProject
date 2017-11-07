import org.assertj.core.api.Assertions;
import org.junit.Test;

public class ProductRepositoryTest {

    public static final Product PRODUCT1 = new Product("Coffe with milk", "COFFEE-440", "12/20/20"
            , "1kh of pure arabica", 19.45, 3.2, "www.test.fr");

    @Test
    public void should_add_product() throws Exception {
        // GIVEN
        ProductRepository productRepository = new ProductRepository();
        Product product = new Product("Coffe with milk", "COFFEE-440", "12/20/20"
                ,"1kh of pure arabica", 19.45, 3.2, "www.test.fr");
        // WHEN
        productRepository.add(product);
        // THEN
        Assertions.assertThat(product).isEqualTo(PRODUCT1);
    }
}
