package com.example.BLOGGO.dao;

import com.example.BLOGGO.beans.users;

public interface userDao {

        boolean emailVerify(users user);
        boolean registerUser(users user);

}
