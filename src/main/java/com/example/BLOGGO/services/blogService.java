package com.example.BLOGGO.services;

import com.example.BLOGGO.beans.blogInfo;
import com.example.BLOGGO.dao.blogDao;
import com.example.BLOGGO.dao.blogDaoImpl;

public class blogService {
    blogDao blogDao=new blogDaoImpl();

    public boolean registerBlog(blogInfo info)
    {
        return blogDao.registerBlog(info);
    }
    public blogInfo getBlog(blogInfo info){return blogDao.getBlog(info);}
}
