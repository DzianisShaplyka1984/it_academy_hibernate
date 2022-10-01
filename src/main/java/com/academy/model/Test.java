package com.academy.model;

import java.util.Collections;
import java.util.List;

public final class Test {

  private final String name;
  private final int age;

  private final List<String> address;

  public Test(String name, int age, List<String> address) {
    this.name = name;
    this.age = age;
    this.address = address;
  }

  public List<String> getAddress() {
    return Collections.unmodifiableList(address);
  }

  public String getName() {
    return this.name;
  }

  public int getAge() {
    return this.age;
  }
}
