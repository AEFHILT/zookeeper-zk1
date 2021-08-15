package service.impl;

import mapper.OrderMapper;
import mapper.ProductMapper;
import models.Order;
import models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.OrderService;

import java.util.UUID;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired(required = false)
    private OrderMapper orderMapper;

    @Autowired(required = false)
    private ProductMapper productMapper;

    @Override
    public void reduceStock(int id) throws InterruptedException {
        Product product = productMapper.selectById(id);
        Thread.sleep(1000);
        if(product.getStock() <= 0) {
            System.out.println("已抢光");
        }
        int i = productMapper.reduceStock(id);
        if(i == 1) {
            Order order =  new Order();
            order.setId(UUID.randomUUID().toString());
            order.setPid(id);
            order.setUserid(101);
            orderMapper.insert(order);
        } else {
            throw new RuntimeException("减库存失败，请重试!!");
        }
    }
}
