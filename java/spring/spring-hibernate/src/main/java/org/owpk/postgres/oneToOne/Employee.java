package org.owpk.postgres.oneToOne;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Setter
@Getter
@Table(name = "employee")
public class Employee {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private String first_name;
  private String last_name;

  @OneToOne
  @JoinColumn(name = "detail_id")
  private EmployeeDetails detail;

  @Override
  public String toString() {
    return String.format("%s %s", first_name, last_name);
  }
}
