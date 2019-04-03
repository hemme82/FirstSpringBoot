package com.text.testing.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudyGuideController {

    @GetMapping("/")
    public String rootView() {
        return "index";
    }
}
