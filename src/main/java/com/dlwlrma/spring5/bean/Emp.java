package com.dlwlrma.spring5.bean;

/**
 * 员工类
 */
public class Emp {

    private String ename;
    private Integer salary;
    //员工属于某一个部门，用部门对象表示
    private Dept dept;

    public void setEname(String ename) {
        this.ename = ename;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public String getEname() {
        return ename;
    }

    public Integer getSalary() {
        return salary;
    }

    public Dept getDept() {
        return dept;
    }

    public void add(){
        System.out.println(ename + "--" + salary + "--" + dept);
    }
}
