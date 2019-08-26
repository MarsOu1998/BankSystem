package DAO;

import PO.Users;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class UserDAO{
    public Users Login(String account,String password){
        Session session=util.HibernateSessionFactory.getSession();
        Users users=(Users)session.get(Users.class,account);
        util.HibernateSessionFactory.closeSession();
            return users;
    }

    public boolean register(String account,String password,String name){
        Session session=util.HibernateSessionFactory.getSession();
        Users users=(Users)session.get(Users.class,account);
        if(users!=null){
            return false;
        }
        else{
            System.out.println(name);
            Users users1=new Users();
            users1.setAccount(account);
            users1.setPassword(password);
            users1.setName(name);
            session.save(users1);
            Transaction transaction=session.beginTransaction();
            transaction.commit();
            return true;
        }
    }

    public void updateUser(Users users){
        Session session=util.HibernateSessionFactory.getSession();
        session.update(users);
        Transaction transaction=session.beginTransaction();
        transaction.commit();
        util.HibernateSessionFactory.closeSession();
    }


}
