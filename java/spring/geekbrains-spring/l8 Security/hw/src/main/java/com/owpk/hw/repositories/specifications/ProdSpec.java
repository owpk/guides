package com.owpk.hw.repositories.specifications;

import com.owpk.hw.entities.Product;
import lombok.AllArgsConstructor;
import org.springframework.data.jpa.domain.Specification;

@AllArgsConstructor
public class ProdSpec {

    public static Specification<Product> priceLessThan(int max) {
        return (Specification<Product>) (root, query, builder) -> builder
                .lessThanOrEqualTo(root.get("price"), max);
    }

    public static Specification<Product> priceGreaterThan(int min) {
        return (Specification<Product>) (root, query, builder) -> builder
                .greaterThanOrEqualTo(root.get("price"), min);
    }

    public static Specification<Product> titleLike(String title) {
        return (Specification<Product>) (root, query, builder) -> builder
                .greaterThanOrEqualTo(root.get("title"), title);
    }
}
