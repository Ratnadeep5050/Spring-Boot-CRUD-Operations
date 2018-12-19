package com.example.payOrders;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PayOrderService {

	@Autowired
	private PayOrderRepository payOrderRepository;
	
	public List<PayOrder> getAllPayOrders() {
		List<PayOrder> payOrders = new ArrayList<PayOrder>();
		payOrderRepository.findAll().forEach(payOrders::add);
		return payOrders;
	}

	public PayOrder getPayOrder(Long id) {
		return payOrderRepository.findOne(id);
	}

	public void addPayOrder() {
		PayOrder payOrder = new PayOrder(1,10000,10,"Tom","Japan","Cat","China");
		payOrderRepository.save(payOrder);
	}

	public void updatePayOrder(Long id, PayOrder payOrder) {
		payOrderRepository.save(payOrder);
	}

	public void deletePayOrder(Long id) {
		payOrderRepository.delete(id);
	}

}
