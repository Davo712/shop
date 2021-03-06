package com.example.shop.repository;

import com.example.shop.model.ItemInBasket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ItemInBasketRepository extends JpaRepository<ItemInBasket,Long> {
    ItemInBasket getById(long id);
    ItemInBasket getByItemId(long id);
    void  deleteByItemId(long id);
}
