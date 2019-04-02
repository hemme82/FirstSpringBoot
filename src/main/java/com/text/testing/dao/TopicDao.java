package com.text.testing.dao;

import com.text.testing.model.Topic;

import java.util.List;

public interface TopicDao {
    List<Topic> findAll();
    Topic findById(Long id);
    void save(Topic topic);
    void delete(Topic topic);
}
