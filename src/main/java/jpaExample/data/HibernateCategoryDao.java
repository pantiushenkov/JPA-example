package jpaExample.data;

import jpaExample.entities.Category;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class HibernateCategoryDao implements CategoryDao {

    @Autowired
    private SessionFactory sessionFactory;

    private Session currentSession(){
        return sessionFactory.getCurrentSession();
    }
    public void addCategory(Category category) {
        currentSession().save(category);
    }
    public Category getCategoryById(int id) {
        return (Category) currentSession().get(Category.class, id);
    }
    public void saveCategory(Category category) {
        currentSession().update(category);
    }

}