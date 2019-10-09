

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ProductDao {

    private List<String> products = new ArrayList<>();

    public void insertProduct(String productName) {
        products.add(productName);

        Connection conn;
        conn.prepareStatement();
    }

    public List<String> listAll() {
        return products;
    }
}
