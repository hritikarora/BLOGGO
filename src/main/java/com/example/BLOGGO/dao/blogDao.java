package com.example.BLOGGO.dao;

import com.example.BLOGGO.beans.blogInfo;

public interface blogDao {
    public boolean registerBlog(blogInfo info);
    public blogInfo getBlog(blogInfo info);
}
