package xyz.marsj.design.pattern.structural.proxy;

/**
 * @Description:
 * @Author: sj
 * @Create: 2019-01-06 17:44
 **/
public class Order {
    private String orderInfo;
    private Integer userId;

    public String getOrderInfo() {
        return orderInfo;
    }

    public void setOrderInfo(String orderInfo) {
        this.orderInfo = orderInfo;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
