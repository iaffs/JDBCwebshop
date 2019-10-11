import org.junit.jupiter.api.Test;

public class WebshopTest {
    @Test
    void shouldRetrieveStoredProduct() {
        ProductDao dao = new ProductDao();
        dao.insertProduct("Apples");
        assertThat(dao.listAll()).contains("Apples");
    }
}

