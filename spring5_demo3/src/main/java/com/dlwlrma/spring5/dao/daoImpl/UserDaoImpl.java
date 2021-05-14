package com.dlwlrma.spring5.dao.daoImpl;

import com.dlwlrma.spring5.dao.UserDao;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {
    public void add() {
        System.out.println("userDao add ......");
    }
}
