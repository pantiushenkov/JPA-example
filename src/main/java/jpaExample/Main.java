package jpaExample;

import jpaExample.Product.Product;
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
    }
}