package com.join.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @GetMapping("/") // 기본페이지 요청 메소드
    public String index() {
        return "index";  // => templates 폴더의 main.html을 찾아감

//    @RequestMapping("/")    // 기본페이지 요청 메소드
//    public String main() {
//            return "main";  // template > main.html으로 보내준다.
//        }
    }
}
