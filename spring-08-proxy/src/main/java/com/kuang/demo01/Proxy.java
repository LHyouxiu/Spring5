package com.kuang.demo01;

public class Proxy {
    private Host host;

    public Proxy(Host host) {
        this.host = host;
    }
    //租房
    public void rent(){
        seeHouse();
        host.rent();
        fare();
    }
        //看房子
    public void seeHouse(){
        System.out.println("带顾客看房子");
    }
        //收中介费
    public void fare(){
        System.out.println("付中介费");
    }
}
