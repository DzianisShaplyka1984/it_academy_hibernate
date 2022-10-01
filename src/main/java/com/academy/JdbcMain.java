package com.academy;

import com.academy.model.entity.Account;
import com.academy.model.entity.Address;
import com.academy.model.entity.Employee;
import com.academy.model.repository.AccountRepository;
import com.academy.model.repository.AddressRepository;
import com.academy.model.repository.EmployeeRepository;
import com.academy.model.repository.impl.AccountRepositoryImpl;
import com.academy.model.repository.impl.AddressRepositoryImpl;
import com.academy.model.repository.impl.EmployeeRepositoryImpl;
import java.sql.SQLException;
import java.util.List;
import org.hibernate.Session;

public class JdbcMain {

  public static void main(String[] args) throws SQLException {
    Account insertAccount = new Account();
    insertAccount.setName("Petya");
    insertAccount.setAmount(200);
//
      AccountRepository accountRepository = new AccountRepositoryImpl();
//    accountRepository.save(insertAccount);
      List<Account> accounts = accountRepository.findAll();

//      account.setAmount(700);
//      accountRepository.save(insertAccount);

//    System.out.println(accounts);

    EmployeeRepository employeeRepository = new EmployeeRepositoryImpl();

    Address address = Address.builder()
        .city("Minks")
        .street("Street")
        .building("100")
        .build();

    Employee employee = Employee.builder()
        .name("Sergey")
        .salary(100)
        .address(address)
        .build();

//    employeeRepository.save(employee);

    AddressRepository addressRepository = new AddressRepositoryImpl();

    //addressRepository.save(address);

//    Address address1 = addressRepository.findById(1);
//
//    List<Employee> employees = address1.getEmployees();
//
//    System.out.println(employees);

//    Employee employee1 = employeeRepository.findById(7890);
//
//    System.out.println(employee1);

    String test1 = new String("test1");
    String test2 = test1;

    System.out.println(test1 == test2);

    System.out.println(test1.equals(test2));
  }
}
