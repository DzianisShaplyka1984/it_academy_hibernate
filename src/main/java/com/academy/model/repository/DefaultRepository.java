package com.academy.model.repository;

import com.academy.model.entity.Account;
import java.util.List;

public interface DefaultRepository<T> {
  void save(T entity);

  void delete(T entity);

  List<T> findAll();

  T findById(Integer id);
}
