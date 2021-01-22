package com.example.BLOGGO.dao;

import com.example.BLOGGO.beans.users;
import com.example.BLOGGO.utils.sessionUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class userDaoImpl implements userDao {
    @Override
    public boolean emailVerify(users user)
    {
        try (Session session = sessionUtil.getSession()) {
            Query query = session.createQuery("from users where email=:email and password=:password");
            query.setParameter("email", user.getEmail());
            query.setParameter("password",user.getPassword());
            if (query.getResultList().size() == 1) {
                System.out.println("success");
                return true;
            }
        } catch (HibernateException exception) {
            System.out.print(exception.getLocalizedMessage());
            return false;
        }
        return false;

    }
    @Override
    public boolean registerUser(users user)
    {
        try (Session session = sessionUtil.getSession()) {
            Transaction transaction = session.beginTransaction();
            session.save(user);
            transaction.commit();
            return true;
        } catch (HibernateException exception) {
            System.out.print(exception.getLocalizedMessage());
            return false;
        }
    }

    }

