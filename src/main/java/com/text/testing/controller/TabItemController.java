package com.text.testing.controller;

import com.text.testing.model.TabItem;
import com.text.testing.repository.TabItemRepository;
import com.text.testing.service.TabItemService;
import com.text.testing.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;

@Controller
public class TabItemController {

    @Autowired
    private TabItemService tabItemService;
//    @Autowired
//    private TopicService topicService;

    @GetMapping("/topic/{id}")
    public String listTabItems(ModelMap model) {


        List<TabItem> tabItems = (List<TabItem>) tabItemService.getAllTabItems();

        model.addAttribute("tabItems", tabItems);
        return "topic";
    }
//    @GetMapping("/topic/{id}")
//    public String listTabItemsById(ModelMap model) {
//
//
//        List<TabItem> tabItems = (List<TabItem>) tabItemService.getAllTabItems();
//
//        model.addAttribute("tabItems", tabItems);
//        return "topic";
//    }

    @GetMapping("/tabitemform")
    public String tabItemForm() {

        //TODO: add all the topics to the model
        return "tabitemform";
    }

    @PostMapping("/addtabitem")
    public <model> String addTabItem(TabItem tabItem) {
        tabItemService.saveTabItem(tabItem);
        return "redirect:/topics/" +tabItem.getTopic().getId();
    }

//    @PutMapping("/topics/{topicid}")
//    public String saveTab(@PathVariable Long topicid) {
//
//    }
//    tabitem/"+tabItem.getId();


}
