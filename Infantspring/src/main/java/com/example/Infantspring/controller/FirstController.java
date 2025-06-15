package com.example.Infantspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;  //내가 import
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {

    @GetMapping("/hi")
    public String niceToMeetYou(Model model) {
        model.addAttribute("username","Seyeon");
        return "Greetings"; //templats 파일안에 Greetings.mustache를 찾아서 브라우저로 전송
    }
    @GetMapping("/bye")
    public String GoodBye(Model model) {
        model.addAttribute("myname","Seyon");
        return "ByeBye"; //templats 파일안에 ByeBye.mustache를 찾아서 브라우저로 전송
    }
}

