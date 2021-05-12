package com.dlwlrma.spring5;

/**
 * 演示使用有参构造注入
 */
public class Orders {

    private String oname;
    private String address;

    public Orders(String oname, String address) {
        this.oname = oname;
        this.address = address;
    }

    public void testOrders(){
        System.out.println(oname + "::" + address);
    }
}
