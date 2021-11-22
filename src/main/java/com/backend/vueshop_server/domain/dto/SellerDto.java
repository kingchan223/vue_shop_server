package com.backend.vueshop_server.domain.dto;

import com.backend.vueshop_server.domain.entity.Seller;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class SellerDto {
    private Long id;
    private String name;
    private String email;
    private String phone;

    public static SellerDto create(Seller seller){
        SellerDto sellerDto = new SellerDto();
        sellerDto.setId(seller.getId());
        sellerDto.setName(seller.getName());
        sellerDto.setEmail(seller.getEmail());
        sellerDto.setPhone(seller.getPhone());
        return sellerDto;
    }
}
