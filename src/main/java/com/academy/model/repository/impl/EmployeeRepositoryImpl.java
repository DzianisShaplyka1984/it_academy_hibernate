package com.academy.model.repository.impl;

import com.academy.DataSource;
import com.academy.model.entity.Employee;
import com.academy.model.repository.EmployeeRepository;
import org.hibernate.Session;

public class EmployeeRepositoryImpl extends DefaultRepositoryImpl<Employee> implements EmployeeRepository {

  @Override
  public Employee findById(Integer id) {
    Session session = DataSource.getInstance().getSession();

    return session.get(Employee.class, id);
  }
}
