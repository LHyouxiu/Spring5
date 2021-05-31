package com.kuang.service;

public class Client {
    public static void main(String[] args) {
        //房东出租房屋
        Host host = new Host();
        //中介代理帮助房东
        Proxy proxy = new Proxy(host);
        //租房者找中介
        proxy.rent();


    }


}
