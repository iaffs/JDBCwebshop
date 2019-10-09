import org.h2.jdbcx.JdbcDataSource;
import org.junit.jupiter.api.Test;
import java.util.Random;

import static org.assertj.core.api.Assertions.assertThat;

public class WebshopTest {

    @Test
    void shouldRetrieveStoredProduct() {
        JdbcDataSource dataSource = new JdbcDataSource();
        ProductDao dao = new ProductDao(dataSource);
        String productName = pickOne(new String[] {"Apples", "Bananas", "Coconuts", "Dates"});
        dao.insertProduct(productName);
        assertThat(dao.listAll()).contains(productName);
    }

    private String pickOne(String[] strings) {
        return strings[new Random().nextInt(strings.length)];
    }

}
