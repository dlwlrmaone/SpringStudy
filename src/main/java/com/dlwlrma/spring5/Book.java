package com.dlwlrma.spring5;

/**
 * 演示使用set方式进行属性注入
 */
public class Book {

    private String bname;
    private Integer price;
    private String address;

    //set方法注入
    public void setBname(String bname) {
        this.bname = bname;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public void testBook(){
        System.out.println(bname + "::" + price + "::" + address);
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
