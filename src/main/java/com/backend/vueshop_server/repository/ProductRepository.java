package com.backend.vueshop_server.repository;

import com.backend.vueshop_server.domain.entity.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@RequiredArgsConstructor
@Repository
public class ProductRepository {
    private final EntityManager em;

    public List<Product> findAll(){
        return em.createQuery("select p from Product p", Product.class).getResultList();
    }

//           "select distinct o from Order o"
//                   + " join fetch o.member m"//member는 To One이기 때문에 데이터 벙튀기 안된다.
//                   + " join fetch o.delivery d"//delivery는 To One이기 때문에 데이터 벙튀기 안된다.
//                   + " join fetch o.orderItems oi"
//                   + " join fetch oi.item i", Order.class)

    public List<Product> findById(Long id) {
        return em.createQuery("select p from Product p"
                        +" join fetch p.seller s"
                        +" join fetch p.category c"
                        +" join fetch p.images i"
                        +"  where p.id=:id", Product.class)
                .setParameter("id", id)
                .getResultList();
    }
//    public Product findById(Long id) {
//        return em.find(Product.class, id);
//    }
}
