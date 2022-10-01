package com.academy.model.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Id;
import lombok.Data;

@Data
@Embeddable
public class LoginPk implements Serializable {
  @Column
  private String email;
  @Column
  private String brand;
}
