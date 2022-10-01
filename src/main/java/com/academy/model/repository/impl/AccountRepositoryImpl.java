package com.academy.model.repository.impl;

import com.academy.DataSource;
import com.academy.model.entity.Account;
import com.academy.model.repository.AccountRepository;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class AccountRepositoryImpl extends DefaultRepositoryImpl<Account> implements AccountRepository {

  public List<Account> findAll() {
    Session session = DataSource.getInstance().getSession();

    Query query = session.createQuery("from Account");

    return query.getResultList();
  }

  @Override
  public Account findById(Integer id) {
    Session session = DataSource.getInstance().getSession();

    return session.get(Account.class, id);
  }
}