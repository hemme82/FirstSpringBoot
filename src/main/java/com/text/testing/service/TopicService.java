package com.text.testing.service;

import com.text.testing.model.Topic;

import java.util.List;

public interface TopicService {
    List<Topic> findAll();
    Topic findById(Long id);
    Topic save(Topic topic);
    void delete(Topic topic);
}
