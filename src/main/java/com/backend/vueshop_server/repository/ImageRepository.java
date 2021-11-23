package com.backend.vueshop_server.repository;

import com.backend.vueshop_server.domain.entity.Image;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@RequiredArgsConstructor
@Repository
public class ImageRepository {

    private final EntityManager em;

    public void addImage(Image image){
        em.persist(image);
    }
}
