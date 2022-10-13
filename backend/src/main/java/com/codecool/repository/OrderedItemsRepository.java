package com.codecool.repository;

import com.codecool.model.OrderedItems;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface OrderedItemsRepository extends JpaRepository<OrderedItems, Long> {
}
