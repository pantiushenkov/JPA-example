package jpaExample.data;

import jpaExample.Product.Product;

public interface ProductDao {

    Product addProduct(Product product);

    Product getProduct(int id);

    void saveProduct(Product product);

}