package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import service.OrderService;

@Controller
public class ProductAction {

    @Autowired
    private OrderService orderService;

    @GetMapping("/product/reduce")
    @ResponseBody
    public Object reduceStock(int id) throws Exception {
        orderService.reduceStock(id);
        return "ok";
    }
}
