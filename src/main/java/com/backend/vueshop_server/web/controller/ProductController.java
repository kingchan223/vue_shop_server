package com.backend.vueshop_server.web.controller;


import com.backend.vueshop_server.domain.dto.ProductListDto;
import com.backend.vueshop_server.domain.dto.respDTO.RespDto;
import com.backend.vueshop_server.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController()
public class ProductController {

    private final ProductService productService;

    @GetMapping("/api/product/all")
    public RespDto<List<ProductListDto>> findAll(){
        List<ProductListDto> result = productService.findAll();
        return new RespDto<>(200, "success", result);
    }
}
