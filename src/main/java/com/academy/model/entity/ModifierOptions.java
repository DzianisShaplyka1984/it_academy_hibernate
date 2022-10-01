package com.academy.model.entity;

import java.time.Instant;
import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import lombok.Data;

@Data
@MappedSuperclass
public class ModifierOptions {
  @Column
  private String modifiedBy;
  @Column
  private String createdBy;
  @Column
  private Instant modified;
  @Column
  private Instant created;
}
