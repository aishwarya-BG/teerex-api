package com.mynewshop.mynewshopapp.DAO;

import com.mynewshop.mynewshopapp.model.User;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@Component
public class UserDAOImp implements UserDAO{

    private EntityManager entityManager;

    @Autowired
    public UserDAOImp(EntityManager theEntityManager)
    {
        entityManager= theEntityManager;
    }

    @Override
    @Transactional
    public List<User> loginCheck(User user) {

        Session currentSession = entityManager.unwrap(Session.class);
        Query<User> theQuery = currentSession.createQuery("select u from User u where u.username=:theusername and u.password=:thepassword ");
        theQuery.setParameter("theusername", user.getUsername());
        theQuery.setParameter("thepassword", user.getPassword());
        List<User> theuser = theQuery.getResultList();
        return theuser;
    }
}
