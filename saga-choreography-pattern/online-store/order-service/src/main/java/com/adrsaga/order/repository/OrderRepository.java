package com.adrsaga.order.repository;

import com.adrsaga.order.entity.PurchaseOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<PurchaseOrder, Integer> {
}
