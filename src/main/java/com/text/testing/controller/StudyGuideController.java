package com.text.testing.controller;

import com.text.testing.model.Topic;
import com.text.testing.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class StudyGuideController {

    @Autowired
    private TopicService topicService;


    @GetMapping("/")
    public String rootView(ModelMap modal) {


            List<Topic> topics = (List<Topic>) topicService.getAllTopics();

            modal.addAttribute("topics", topics);
            return "index";

    }
}
