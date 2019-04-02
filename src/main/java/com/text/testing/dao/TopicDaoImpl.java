package com.text.testing.dao;

import com.text.testing.model.Topic;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.CriteriaUpdate;
import java.util.List;

@Repository//this and @Service always go on Impl and not on interfaces.
public class TopicDaoImpl implements TopicDao{

    @Autowired
    private EntityManager entityManager;

    private Session getSession(){
        return entityManager.unwrap(Session.class);
    }
//    @Autowired   //this is old way.
//    private SessionFactory sessionFactory;

    @Override
    public List<Topic> findAll() {
        //open a session
        Session session = getSession();

        //Create CriteriaBuilder
        CriteriaBuilder builder = session.getCriteriaBuilder();

        //Create CriteriaQuery
        CriteriaQuery<Topic> criteria = builder.createQuery(Topic.class);

        //Specify criteria root
        criteria.from(Topic.class);

        //Execute query
        List<Topic> topics = session.createQuery(criteria).getResultList();

        // Close Session
        session.close();

        return topics;
    }

    @Override
    public Topic findById(Long id) {
        return null;
    }

    @Override
    public void save(Topic topic) {
        //open a session
//        Session session = sessionFactory.openSession();
//
//        //begin a transaction
//        session.beginTransaction();
//
//        //save the topic
//        session.save(topic);
//
//        //commit a transaction
//        session.getTransaction().commit();
//
//        //close the session
//        session.close();

    }

    @Override
    public void delete(Topic topic) {

    }
}
