package com.text.testing.repository;

import com.text.testing.model.TabItem;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TabItemRepository extends CrudRepository<TabItem, Long> {

    //derived query: needs to start with "findBy" then the field
    public List<TabItem> findAllByTopicId(Long  Id);
}
