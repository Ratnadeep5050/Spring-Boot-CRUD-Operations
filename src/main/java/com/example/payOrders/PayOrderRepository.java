package com.example.payOrders;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface PayOrderRepository extends JpaRepository<PayOrder, Long> {

}
