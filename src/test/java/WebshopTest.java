import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class WebshopTest {

    @Test
    void shouldRetrieveStoredProduct() {
        ProductDao dao = new ProductDao();
        dao.insertProduct("Apples");
        assertThat(dao.listAll()).contains("Apples");
    }

}
