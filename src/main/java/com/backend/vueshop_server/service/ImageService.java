package com.backend.vueshop_server.service;


import com.backend.vueshop_server.domain.entity.Image;
import com.backend.vueshop_server.domain.entity.Product;
import com.backend.vueshop_server.repository.ImageRepository;
import com.backend.vueshop_server.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Transactional(readOnly = true)
@Service
public class ImageService {

    private final ImageRepository imageRepository;
    private final ProductService productService;

    @Transactional
    public void addImage(){
        Product product = productService.findByIdOG(1L);
        Image image = Image.create(3, "https://exit.ohou.se/713ae97ebf6d3e09fd00f3c330950fe147bfbcf8/ai.esmplus.com/crtek/1Lee/PC_ETC/Keychron/K1%20V4/Keychron-K1V4_01.jpg", product);
        imageRepository.addImage(image);
    }
}
