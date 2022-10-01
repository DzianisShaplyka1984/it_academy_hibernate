package com.academy.model.repository.impl;

import com.academy.DataSource;
import com.academy.model.repository.DefaultRepository;
import java.util.List;
import javax.persistence.EntityManager;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class DefaultRepositoryImpl<T> implements DefaultRepository<T> {

  @Override
  public void save(T entity) {
    Session session = DataSource.getInstance().getSession();

    Transaction transaction = session.beginTransaction();

    session.saveOrUpdate(entity);

    transaction.commit();
  }

  @Override
  public void delete(T entity) {
    EntityManager entityManager = DataSource.getInstance().getEntityManager();
    entityManager.getTransaction().begin();
    entityManager.remove(entityManager.contains(entity) ? entity : entityManager.merge(entity));
    entityManager.getTransaction().commit();
  }

  @Override
  public List<T> findAll() {
    return null;
  }

  @Override
  public T findById(Integer id) {
    return null;
  }
}
