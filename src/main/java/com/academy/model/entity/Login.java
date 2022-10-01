package com.academy.model.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Login {
  @EmbeddedId
  private LoginPk id;
  @Column
  private String name;
}
