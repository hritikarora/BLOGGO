package com.example.BLOGGO.services;

import com.example.BLOGGO.beans.users;
import com.example.BLOGGO.dao.userDao;
import com.example.BLOGGO.dao.userDaoImpl;

public class userService {

    userDao userDao = new userDaoImpl();

    public boolean registerUser(users user){

        return userDao.registerUser(user);
    }

    public boolean verifyEmail(users user){
        return userDao.emailVerify(user);
    }
}

