package com.kuang.demo03;

public class Client {
    public static void main(String[] args) {
        //真实角色
        Host host = new Host();
        //代理实例的调用处理程序
        ProxyInvocationHandler handler = new ProxyInvocationHandler();
        handler.setRent(host);
        Rent proxy = (Rent) handler.getProxy();
        proxy.rent();

    }
}
