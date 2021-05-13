package com.dlwlrma.spring5.factoryBean;

import com.dlwlrma.spring5.collectiontype.Course;
import org.springframework.beans.factory.FactoryBean;

public class MyBean implements FactoryBean<Course> {

    public Course getObject() throws Exception {
        Course course = new Course();
        course.setCname("语文课");
        return course;
    }

    public Class<?> getObjectType() {
        return null;
    }
}
