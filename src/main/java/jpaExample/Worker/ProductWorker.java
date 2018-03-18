package jpaExample.Worker;

import jpaExample.entities.Product;
import jpaExample.data.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;

public class ProductWorker {
    @Autowired
    private ProductDao productDao;

    public void addProduct(Product product) {
        if ((product != null) && (product.getName() != null) && (!"".equals(product.getName())) && (product.getQuantityKG() > 0)) {
            productDao.addProduct(product);
            System.out.println("Product have been saved " + product.toString());
        }
    }

    public Product getProductByIdFromDb(int i) {
        return productDao.getProductByIdFromDb(i);
    }
}