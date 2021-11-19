package com.backend.vueshop_server.domain.dto;

import com.backend.vueshop_server.domain.entity.ActiveType;
import com.backend.vueshop_server.domain.entity.Category;
import com.backend.vueshop_server.domain.entity.Product;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class ProductListDto {
    private Long id;
    private String product_name;
    private int product_price;
    private String tags;
    private String thumbnail_image_path;
    private String category1;
    private String category2;
    private String category3;
    private String activeType;

    public static ProductListDto create(Product product){
        ProductListDto productListDto = new ProductListDto();
        productListDto.setId(product.getId());
        productListDto.setProduct_name(product.getProduct_name());
        productListDto.setProduct_price(product.getProduct_price());
        productListDto.setTags(product.getTags());
        productListDto.setCategory1(product.getCategory().getCategory1());
        productListDto.setCategory2(product.getCategory().getCategory2());
        productListDto.setCategory3(product.getCategory().getCategory3());
        productListDto.setActiveType(product.getActiveType().toString());
        productListDto.setThumbnail_image_path(product.getThumbnail_image_path());
        return productListDto;
    }
}
