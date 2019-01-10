package xyz.marsj.design.pattern.structural.proxy.staticproxy;

import xyz.marsj.design.pattern.structural.proxy.IOrderService;
import xyz.marsj.design.pattern.structural.proxy.Order;
import xyz.marsj.design.pattern.structural.proxy.OrderServiceImpl;
import xyz.marsj.design.pattern.structural.proxy.db.DataSourceContextHolder;

/**
 * @Description:
 * @Author: sj
 * @Create: 2019-01-06 17:53
 **/
public class OrderServiceStaticProxy {
    private IOrderService iOrderService;

    public int saveOrder(Order order) {
        before(order);
        int result = iOrderService.saveOrder(order);
        after();
        return result;
    }

    private void before(Order order) {
        System.out.println("static proxy before method");
        //imitate spring
        iOrderService = new OrderServiceImpl();
        //enhance method
        int userId = order.getUserId();
        int dbRouter = userId % 2;
        System.out.println("static proxy distribute database [db " + dbRouter + "]");
        // spilt database
        DataSourceContextHolder.setDBType("db" + dbRouter);
    }

    private void after() {
        System.out.println("static proxy after method");
    }
}
