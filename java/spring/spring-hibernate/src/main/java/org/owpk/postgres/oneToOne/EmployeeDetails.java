package org.owpk.postgres.oneToOne;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;

@Entity
@NoArgsConstructor
@Setter
@Getter
@Table(name = "emp_details")
public class EmployeeDetails {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private long id;
   private String detail;

   @OneToOne(mappedBy = "detail")
   private Employee employee;

   @Override
   public String toString() {
      return ":" + detail + " : ";
   }
}
