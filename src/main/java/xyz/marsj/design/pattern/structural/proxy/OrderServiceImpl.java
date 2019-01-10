package xyz.marsj.design.pattern.structural.proxy;

/**
 * @Description:
 * @Author: sj
 * @Create: 2019-01-06 17:48
 **/
public class OrderServiceImpl implements IOrderService {
    private IOrderDao iOrderDao;

    @Override
    public int saveOrder(Order order) {
        //imitate spring
        iOrderDao = new OrderDaoImpl();
        System.out.println("OrderServiceImpl user the method insertOrder in iOrderDao");
        return iOrderDao.insertOrder(order);
    }
}
