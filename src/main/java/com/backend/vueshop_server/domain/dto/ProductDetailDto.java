package com.backend.vueshop_server.domain.dto;


import com.backend.vueshop_server.domain.entity.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

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
    private Seller seller;
    private Category category;
    private ActiveType activeType;
    private List<ImageDto> imageDtos;

    public static ProductDetailDto create(Product product){
        ProductDetailDto productDetailDto = new ProductDetailDto();
        productDetailDto.setId(product.getId());
        productDetailDto.setProduct_name(product.getProduct_name());
        productDetailDto.setProduct_price(product.getProduct_price());
        productDetailDto.setDelivery_price(product.getDelivery_price());
        productDetailDto.setAdd_delivery_price(product.getAdd_delivery_price());
        productDetailDto.setTags(product.getTags());
        productDetailDto.setOutbound_days(product.getOutbound_days());
        productDetailDto.setSeller(product.getSeller());
        productDetailDto.setCategory(product.getCategory());
        productDetailDto.setActiveType(product.getActiveType());
        List<Image> images = product.getImages();
        List<ImageDto> imageDtos = new ArrayList<>();
        for (Image img : images) {
            ImageDto imageDto = ImageDto.create(img);
            imageDtos.add(imageDto);
        }
        productDetailDto.setImageDtos(imageDtos);
        return productDetailDto;
    }
}
