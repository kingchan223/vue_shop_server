package com.backend.vueshop_server.domain.dto;

import com.backend.vueshop_server.domain.entity.Category;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CategoryDto {

    private String category1;
    private String category2;
    private String category3;

    public static CategoryDto create(Category category){
        CategoryDto categoryDto = new CategoryDto();
        categoryDto.setCategory1(category.getCategory1());
        categoryDto.setCategory2(category.getCategory2());
        categoryDto.setCategory3(category.getCategory3());
        return categoryDto;
    }
}
