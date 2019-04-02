package com.text.testing.controller;


import com.text.testing.model.Topic;
import com.text.testing.repository.TopicRepository;
import com.text.testing.service.TopicService;
import com.text.testing.service.TopicService2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class TopicController {

    @Autowired
    private TopicRepository topicRepository;


    @GetMapping("/topics")
    public String listTopics(ModelMap model) {


        List<Topic> topics = (List<Topic>) topicRepository.findAll();

        model.addAttribute("topics", topics);
        return "index";
    }





    @PostMapping("/add")
    public String save(@RequestBody Topic topic) {

        topicRepository.save(topic);

        return "redirect:/topics";
    }


}
