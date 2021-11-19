package com.backend.vueshop_server.repository;

import com.backend.vueshop_server.domain.entity.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@RequiredArgsConstructor
@Repository
public class ProductRepository {
    private final EntityManager em;

    public List<Product> findAll(){
        return em.createQuery("select p from Product p", Product.class).getResultList();
    }
}
