package jpaExample.Worker;

import jpaExample.data.CategoryDao;
import jpaExample.entities.Category;
import org.springframework.beans.factory.annotation.Autowired;

public class CategoryWorker {
    @Autowired
    private CategoryDao categoryDao;

    public Category addCategory(Category category) {
        categoryDao.addCategory(category);
        System.out.println("Category has been added " + category);
        return category;
    }

    public Category getCategoryById(int id) {
        return categoryDao.getCategoryById(id);
    }

}
