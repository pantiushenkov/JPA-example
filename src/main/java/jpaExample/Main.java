package jpaExample;

import jpaExample.Worker.CategoryWorker;
import jpaExample.entities.Category;
import jpaExample.entities.Product;
import jpaExample.Worker.ProductWorker;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringBean.xml");
        Product product = new Product();
        product.setName("oranges");
        product.setQuantityKG(4.7);
        ProductWorker worker = (ProductWorker) context.getBean("worker");
        worker.addProduct(product);
        CategoryWorker categoryWorker =
                (CategoryWorker) context.getBean("categoryWorker");
        Category category = new Category();
        category.setName("Fruits");
        categoryWorker.addCategory(category);
    }
}