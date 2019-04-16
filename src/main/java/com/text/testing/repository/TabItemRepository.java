package com.text.testing.repository;

import com.text.testing.model.TabItem;
import org.springframework.data.repository.CrudRepository;

public interface TabItemRepository extends CrudRepository<TabItem, Long> {
}
