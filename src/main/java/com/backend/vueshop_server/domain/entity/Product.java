package com.backend.vueshop_server.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Table(name="t_product")
@Entity
public class Product{
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="product_id")
    private Long id;
    private String product_name;
    private int product_price;
    private int delivery_price;
    private int add_delivery_price;
    private String tags;
    private short outbound_days;
    private LocalDateTime created_date;

    @Enumerated(EnumType.STRING)
    private ActiveType activeType;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="seller_id")
    private Seller seller;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="category_id")
    private Category category;

    @OneToMany
    @JoinColumn(name="image_id")
    private List<Image> images;
}
