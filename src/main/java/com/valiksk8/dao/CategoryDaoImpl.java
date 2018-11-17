package com.valiksk8.dao;

import com.valiksk8.model.Category;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class CategoryDaoImpl implements CategoryDao {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Category> getAll() {
        return sessionFactory
                .getCurrentSession()
                .createNativeQuery("SELECT * FROM CATEGORIES", Category.class)
                .list();
    }

    //fetch - підтянути, підгрузити
    @Override
    public Category getById(Long id) {
        return sessionFactory
                .getCurrentSession()
                .createQuery("from Category c join fetch c.productList where c.id =:id", Category.class)
                .setParameter("id", id)
                .uniqueResult();
    }
}
