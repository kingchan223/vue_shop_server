package com.backend.vueshop_server.service;

import com.backend.vueshop_server.domain.dto.ProductDetailDto;
import com.backend.vueshop_server.domain.dto.ProductListDto;
import com.backend.vueshop_server.domain.entity.Product;
import com.backend.vueshop_server.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Transactional(readOnly = true)
@Service
public class ProductService {

    private final ProductRepository productRepository;

    public List<ProductListDto> findAll(){
        List<Product> products = productRepository.findAll();
        List<ProductListDto> productListDtos = new ArrayList<>();
        for (Product product : products) productListDtos.add(ProductListDto.create(product));
        return productListDtos;
    }

    public ProductDetailDto findById(Long id){
        List<Product> products = productRepository.findById(id);
        return ProductDetailDto.create(products.get(0));
    }
}
