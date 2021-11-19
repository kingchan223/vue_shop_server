package com.backend.vueshop_server.domain.dto;

import com.backend.vueshop_server.domain.entity.Image;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ImageDto {
    private Long id;
    private int type;
    private String path;

    public static ImageDto create(Image image){
        ImageDto imageDto = new ImageDto();
        imageDto.setId(image.getId());
        imageDto.setType(image.getType());
        imageDto.setPath(image.getPath());
        return imageDto;
    }
}
