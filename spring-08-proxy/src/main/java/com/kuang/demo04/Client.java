package com.kuang.demo04;

public class Client {
    public static void main(String[] args) {
        //真实角色
        Host host = new Host();
        //代理实例的调用处理程序
        ProxyInvocationHandler handler = new ProxyInvocationHandler();
        handler.setTarget(host);
        Rent proxy = (Rent) handler.getProxy();
        proxy.rent();

    }
}
