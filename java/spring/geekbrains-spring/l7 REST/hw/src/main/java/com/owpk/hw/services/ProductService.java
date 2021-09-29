package com.owpk.hw.services;

import com.owpk.hw.dto.ProdDTO;
import com.owpk.hw.entities.Product;
import com.owpk.hw.repositories.ProdRepo;
import com.owpk.hw.repositories.specification.ProdSpec;
import com.owpk.hw.utils.ProdFilter;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ProductService {
  private ProdRepo prodRepo;

  public Page<Product> findAll(Map<String, String> params, Pageable var) {
    return prodRepo.findAll(new ProdFilter().creatSpecAndAttributes(params), var);
  }

  public List<ProdDTO> findAll() {
    List<Product> prods = prodRepo.findAll();
    return prods.stream()
        .map(x -> new ProdDTO(x.getId(), x.getTitle(), x.getPrice()))
        .collect(Collectors.toList());
  }

  public List<ProdDTO> findWithFilters(Map<String, String> params) {
    List<Product> prods = prodRepo.findAll(new ProdFilter().creatSpecAndAttributes(params));
    return prods.stream()
        .map(x -> new ProdDTO(x.getId(), x.getTitle(), x.getPrice()))
        .collect(Collectors.toList());
  }
}
