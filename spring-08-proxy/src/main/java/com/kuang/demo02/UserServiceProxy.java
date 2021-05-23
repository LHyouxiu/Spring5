package com.kuang.demo02;

public class UserServiceProxy {
    private UserServiceImpl userService;

//    public UserServiceProxy(UserServiceImpl userService) {
//        this.userService = userService;
//    }

    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }

    public void add(){
        log("add");
        userService.add();
    }

    public void delete(){
        log("delete");
        userService.delete();
    }

    public void update(){
        log("update");
        userService.update();
    }

    public void query(){
        log("query");
        userService.query();
    }

    public void log(String msg){
        System.out.println("新增一条"+msg+"日志");
    }
}
