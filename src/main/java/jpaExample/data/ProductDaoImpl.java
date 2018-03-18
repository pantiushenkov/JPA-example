package jpaExample.data;


import jpaExample.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class ProductDaoImpl implements ProductDao {
    private static final String SQL_INSERT_PRODUCT =
            "insert into products (name,quantityKG) values (?,?)";
    private static final String SQL_SELECT_PRODUCT_BY_ID =
            "select id, name from products where id = ?";

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void addProduct(Product product) {
        jdbcTemplate.update(SQL_INSERT_PRODUCT,
                product.getName(),
                product.getQuantityKG());
    }


    public Product getProductByIdFromDb(int id) {
        return jdbcTemplate.queryForObject(SQL_SELECT_PRODUCT_BY_ID,
                new RowMapper<Product>() {
                    public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
                        Product product = new Product(

                        );
                        product.setId(rs.getInt(1));
                        product.setName(rs.getString(2));
                        product.setQuantityKG(rs.getInt(3));
                        return product;
                    }
                }, id);
    }
}