package xyz.marsj.design.pattern.structural.proxy.dynamicproxy;

import xyz.marsj.design.pattern.structural.proxy.Order;
import xyz.marsj.design.pattern.structural.proxy.db.DataSourceContextHolder;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Description:
 * @Author: sj
 * @Create: 2019-01-11 20:59
 **/
public class OrderServiceDynamicProxy implements InvocationHandler {
    private Object target;

    public OrderServiceDynamicProxy(Object object) {
        this.target = object;
    }

    public Object bind() {
        Class<?> clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object arg = args[0];
        beforeMethod(arg);
        Object result = method.invoke(target, args);
        afterMethod();
        return result;
    }

    private void beforeMethod(Object object) {
        int userId = 0;
        System.out.println("dynamic proxy before method");
        if (object instanceof Order) {
            Order order = (Order) object;
            //enhance method
            userId = order.getUserId();
        }
        //else if (object instanceof xxx)
        int dbRouter = userId % 2;
        System.out.println("dynamic proxy distribute database [db " + dbRouter + "]");
        // spilt database
        DataSourceContextHolder.setDBType("db" + dbRouter);
    }

    private void afterMethod() {
        System.out.println("dynamic proxy after method");
    }
}
