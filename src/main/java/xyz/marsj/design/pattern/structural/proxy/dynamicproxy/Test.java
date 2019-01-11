package xyz.marsj.design.pattern.structural.proxy.dynamicproxy;

import xyz.marsj.design.pattern.structural.proxy.IOrderService;
import xyz.marsj.design.pattern.structural.proxy.Order;
import xyz.marsj.design.pattern.structural.proxy.OrderServiceImpl;

/**
 * @Description:
 * @Author: sj
 * @Create: 2019-01-10 19:50
 **/
public class Test {
    public static void main(String[] args) {
        Order order = new Order();
        order.setUserId(2);
        IOrderService orderService = (IOrderService) new OrderServiceDynamicProxy(new OrderServiceImpl()).bind();
        orderService.saveOrder(order);
    }
}
