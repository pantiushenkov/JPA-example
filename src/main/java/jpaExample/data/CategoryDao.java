package jpaExample.data;

import jpaExample.entities.Category;

public interface CategoryDao {
    void addCategory(Category category);
    Category getCategoryById(int id);
}