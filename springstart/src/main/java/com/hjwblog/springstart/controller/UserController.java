package com.hjwblog.springstart.controller;

import com.hjwblog.springstart.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;


@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/all")
    public String all(Model model) {
        List<User> userList = new ArrayList<User>(){{
                add(new User("hjw", "hjw"));
                add(new User("1", "1"));
            }};
        model.addAttribute("users", userList);
        return "user";
    }
}
