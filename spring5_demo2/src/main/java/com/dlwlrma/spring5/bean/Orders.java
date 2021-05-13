package com.dlwlrma.spring5.bean;

public class Orders {

    private String oname;

    public void setOname(String oname) {
        this.oname = oname;
        System.out.println("第二步：调用set方法设置bean对象属性值");
    }

    public Orders() {
        System.out.println("第一步：执行无参数构造函数，创建bean实例");
    }

    //创建执行初始化的方法
    public void init(){
        System.out.println("第三步：执行bean初始化方法");
    }

    public void destory(){
        System.out.println("第五步：执行bean销毁的方法");
    }
}
