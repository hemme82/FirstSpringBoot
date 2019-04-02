package com.text.testing.service;

import com.text.testing.dao.TopicDao;
import com.text.testing.model.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TopicServiceImpl implements TopicService {

    @Autowired//autowire reference based on interface
    private TopicDao topicDao;

    @Override
    public List<Topic> findAll() {
        return topicDao.findAll();
    }

    @Override
    public Topic findById(Long id) {
        return null;
    }

    @Override
    public Topic save(Topic topic) {
//        topicDao.save(topic);
        return topic;
    }

    @Override
    public void delete(Topic topic) {

    }
}
