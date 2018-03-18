package jpaExample.data;


import jpaExample.Product.Product;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
@Transactional
public class ProductDaoImpl implements ProductDao {
    @PersistenceContext
    private EntityManager em;

    public Product addProduct(Product product) {
        em.persist(product);
        return product;
    }

    public Product getProduct(int id) {
        return em.find(Product.class, id);
    }

    public void saveProduct(Product product) {
        em.merge(product);
    }
}