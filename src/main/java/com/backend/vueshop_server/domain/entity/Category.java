package com.backend.vueshop_server.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Table(name="t_category")
@Entity
public class Category {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="category_id")
    private Long id;
    private String category1;
    private String category2;
    private String category3;
    @OneToMany(mappedBy="category")
    private List<Product> products = new ArrayList<>();
}
