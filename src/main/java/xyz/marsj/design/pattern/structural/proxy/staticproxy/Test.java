package xyz.marsj.design.pattern.structural.proxy.staticproxy;

import xyz.marsj.design.pattern.structural.proxy.Order;

/**
 * @Description:
 * @Author: sj
 * @Create: 2019-01-10 19:50
 **/
public class Test {
    public static void main(String[] args) {
        Order order = new Order();
        order.setUserId(1);
        OrderServiceStaticProxy orderServiceStaticProxy = new OrderServiceStaticProxy();
        orderServiceStaticProxy.saveOrder(order);
    }
}
