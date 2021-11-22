package com.backend.vueshop_server.domain.dto;


import com.backend.vueshop_server.domain.entity.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ProductDetailDto {
    private Long id;
    private String product_name;
    private int product_price;
    private int delivery_price;
    private int add_delivery_price;
    private String tags;
    private short outbound_days;
    private SellerDto seller;
    private CategoryDto category;
    private ActiveType activeType;
    private List<ImageDto> images;

    public static ProductDetailDto create(Product product){
        ProductDetailDto productDetailDto = new ProductDetailDto();
        productDetailDto.setId(product.getId());
        productDetailDto.setProduct_name(product.getProduct_name());
        productDetailDto.setProduct_price(product.getProduct_price());
        productDetailDto.setDelivery_price(product.getDelivery_price());
        productDetailDto.setAdd_delivery_price(product.getAdd_delivery_price());
        productDetailDto.setTags(product.getTags());
        productDetailDto.setOutbound_days(product.getOutbound_days());
        productDetailDto.setSeller(SellerDto.create(product.getSeller()));
        productDetailDto.setCategory(CategoryDto.create(product.getCategory()));
        productDetailDto.setActiveType(product.getActiveType());
        List<ImageDto> imageDtos = product.getImages().stream().map(ImageDto::create).collect(Collectors.toList());
        productDetailDto.setImages(imageDtos);
        return productDetailDto;
    }
}
