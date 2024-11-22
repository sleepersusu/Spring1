package com.bistro.demo.service;

import com.bistro.demo.model.OrderDetails;
import com.bistro.demo.model.OrderDetailsId;
import com.bistro.demo.model.OrderDetailsId;
import com.bistro.demo.model.OrderDetailsRepositoryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailsService {

    @Autowired
    private OrderDetailsRepositoryDao orderDetailsRepositoryDao;

    public OrderDetails addToOrderDetails(Integer ordersId, Integer menuId){

        OrderDetailsId orderDetailsId =  new OrderDetailsId(ordersId,menuId);
        OrderDetails orderDetails = new OrderDetails();

        orderDetails.setOrderDetailsPFKId(orderDetailsId);
        orderDetails.setOdQuantity(1);

        return orderDetails;
    }
}
