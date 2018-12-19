package com.example.payOrders;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PayOrderController {

	@Autowired
	private PayOrderService payOrderService;
	
	@RequestMapping("/payorders")
	public List<PayOrder> getAllPayOrders(){
		return payOrderService.getAllPayOrders();
	}
	
	@RequestMapping("/payorders/{id}")
	public PayOrder getPayOrder(@PathVariable Long id) {
		return payOrderService.getPayOrder(id);
	}
	
	@RequestMapping("/payorder")
	public void addPayOrder() {
		payOrderService.addPayOrder();
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/payorder/{id}")
	public void updatePayOrder(@RequestBody PayOrder payOrder, @PathVariable Long id) {
		payOrderService.updatePayOrder(id, payOrder);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/payorder/{id}")
	public void deletePayOrder(@PathVariable Long id) {
		payOrderService.deletePayOrder(id);
	}
	
	

}
