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
@Table(name="t_seller")
@Entity
public class Seller {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="seller_id")
    private Long id;
    private String name;
    private String email;
    private String phone;
    @OneToMany(mappedBy="seller")//    @JsonIgnore
    private List<Product> products  = new ArrayList<>();
}
