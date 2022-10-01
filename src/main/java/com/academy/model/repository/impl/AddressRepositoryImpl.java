package com.academy.model.repository.impl;

import com.academy.DataSource;
import com.academy.model.entity.Address;
import com.academy.model.entity.Employee;
import com.academy.model.repository.AddressRepository;
import java.util.List;
import org.hibernate.Session;

public class AddressRepositoryImpl extends DefaultRepositoryImpl<Address> implements AddressRepository {

  @Override
  public List<Address> findAll() {
    return null;
  }

  @Override
  public Address findById(Integer id) {
    Session session = DataSource.getInstance().getSession();

    return session.get(Address.class, id);
  }
}
