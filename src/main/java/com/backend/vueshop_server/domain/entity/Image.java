package com.backend.vueshop_server.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Table(name="t_product_image")
@Entity
public class Image{
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="image_id")
    private Long id;
    private int type;//1은 썸네일, 2는 제품이미지, 3은 제품 설명 이미지
    private String path;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="product_id")
    private Product product;

    public static Image create(int type, String path, Product product){
        Image image = new Image();
        image.setType(type);
        image.setPath(path);
        image.addProduct(product);
        return image;
    }

    private void addProduct(Product product){
        this.product = product;
        product.getImages().add(this);
    }

    private void setId(Long id) {
        this.id = id;
    }

    private void setType(int type) {
        this.type = type;
    }

    private void setPath(String path) {
        this.path = path;
    }

    private void setProduct(Product product) {
        this.product = product;
    }
}
