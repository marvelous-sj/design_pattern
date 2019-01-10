package xyz.marsj.design.pattern.structural.proxy;

/**
 * @Description:
 * @Author: sj
 * @Create: 2019-01-06 17:47
 **/
public class OrderDaoImpl implements IOrderDao {
    @Override
    public int insertOrder(Order order) {
        System.out.println("insert an order");
        return 1;
    }
}
