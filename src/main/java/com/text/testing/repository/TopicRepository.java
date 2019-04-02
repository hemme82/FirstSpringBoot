package com.text.testing.repository;

import com.text.testing.model.Topic;
import org.springframework.data.repository.CrudRepository;


public interface TopicRepository extends CrudRepository<Topic, Long> {
}
