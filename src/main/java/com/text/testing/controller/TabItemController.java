package com.text.testing.controller;

import com.text.testing.model.TabItem;
import com.text.testing.repository.TabItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class TabItemController {

    @Autowired
    private TabItemRepository tabItemRepository;

    @GetMapping("/topic")
    public String listTabItems(ModelMap model) {


        List<TabItem> tabItems = (List<TabItem>) tabItemRepository.findAll();

        model.addAttribute("tabItems", tabItems);
        return "topic";
    }

    @GetMapping("/tabitemform")
    public String tabItemForm() {
        return "tabitemform";
    }

    @PostMapping("/addtabitem")
    public String addTopic(TabItem tabItem) {
        tabItemRepository.save(tabItem);
        return "redirect:/topics";
    }
//    tabitem/"+tabItem.getId();
}
