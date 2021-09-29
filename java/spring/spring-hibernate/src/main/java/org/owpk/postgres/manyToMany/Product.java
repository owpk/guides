package org.owpk.postgres.manyToMany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "products")
@NamedQuery(name = "Product.getAll", query = "SELECT p FROM Product p")
public class Product {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private long id;
   private String name;

   @ManyToMany(fetch = FetchType.EAGER)
   @JoinTable(name = "product_categories", joinColumns = @JoinColumn(name = "product_id"), inverseJoinColumns = @JoinColumn(name = "category_id"))
   private List<Category> categories;

   @Override
   public String toString() {
      return "{" + " id='" + getId() + "'" + ", name='" + getName() + "}";
   }
}
