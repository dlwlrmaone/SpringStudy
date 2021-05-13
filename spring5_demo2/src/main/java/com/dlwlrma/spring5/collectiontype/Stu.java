package com.dlwlrma.spring5.collectiontype; 

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 学生类
 */
public class Stu {

    private String[] courses;
    private List<String> list;
    private Map<String,String> map;
    private Set<String> set;

    //学生学习的多门课程
    private List<Course> courseList;

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public void out(){
        System.out.println(Arrays.toString(courses));
        System.out.println(list);
        System.out.println(map);
        System.out.println(set);
    }
}
