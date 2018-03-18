package jpaExample.Worker;

import jpaExample.Product.Product;
import jpaExample.data.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;

public class ProductWorker {
    @Autowired
    ProductDao productsDao;

    public Product addProduct(Product product) {
        product = productsDao.addProduct(product);
        System.out.println(product.getId() + " " + product.getName() + " " + product.getQuantityKG());
        return product;
    }
}