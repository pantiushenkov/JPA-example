package jpaExample.data;

import jpaExample.entities.Product;

public interface ProductDao {

    void addProduct(Product product);

    Product getProductByIdFromDb(int i);

}