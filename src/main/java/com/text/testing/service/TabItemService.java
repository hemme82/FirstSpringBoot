package com.text.testing.service;

import com.text.testing.model.TabItem;
import com.text.testing.repository.TabItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TabItemService {
    @Autowired
    private TabItemRepository tabItemRepository;

    // TODO: 4/9/2019 add getAllTabItems by topic ID

    public void addTabItem(TabItem tabItem) {
        tabItemRepository.save(tabItem);
    }
}
