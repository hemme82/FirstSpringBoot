package com.text.testing.controller;


import com.text.testing.model.Topic;
import com.text.testing.repository.TopicRepository;
//import com.text.testing.service.TopicService;
//import com.text.testing.service.TopicService2;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

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

    @GetMapping("/topics/{topicId}")
    public String getTopic(@PathVariable Long topicId,
                           ModelMap model, HttpServletResponse response) throws IOException {
        Optional<Topic> topicOptional = topicRepository.findById(topicId);

        if (topicOptional.isPresent()) {
            Topic topic = topicOptional.get();
            model.put("topic", topic);

        } else {
            response.sendError(HttpStatus.NOT_FOUND.value(), "Topic with id " + topicId + " was not found" );
//            throw new NotFoundException("Topic with id " + topicId + " was not found");
            return "topic";
        }
        return"topic";
    }
    @GetMapping("/topicform")
    public String topicForm(){
//            @RequestBod Topic topic) {
        return "topicform";
    }

    @PostMapping("/addtopic")
    public String addTopic(Topic topic) {
        topicRepository.save(topic);
        return "redirect:/topics/"+topic.getId();
    }
    @PostMapping("/topics/{topicId}")
    public String updateTopic(@PathVariable Long topicId, Topic topic){
        System.out.println(topic);
        return "redirect:/topics/"+topic.getId();
    }


}
