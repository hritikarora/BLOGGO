package com.example.BLOGGO.dao;

import com.example.BLOGGO.beans.blogInfo;
import com.example.BLOGGO.utils.sessionUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class blogDaoImpl implements blogDao{
    @Override
    public boolean registerBlog(blogInfo info)
    {
        try (Session session=sessionUtil.getSession()){
            Transaction transaction = session.beginTransaction();
            session.save(info);
            transaction.commit();
            return true;
        }
        catch (HibernateException exception)
        {
            System.out.print(exception.getLocalizedMessage());
            return false;

        }
    }
    @Override
    public blogInfo getBlog(blogInfo info)
    {
        try(Session session = sessionUtil.getSession())
        {
            Query query = session.createQuery("from blogInfo where topic=:topic");
            query.setParameter("topic",info.getTopic());

            if(query.getResultList().size()==1)
            {
                info=(blogInfo) query.getSingleResult();
                System.out.print(info.getDescription());
                return info;
            }
            else
            {
                return null;
            }
        }
        catch (HibernateException exception)
        {
            System.out.print(exception.getLocalizedMessage());
            return null;
        }
    }
}
