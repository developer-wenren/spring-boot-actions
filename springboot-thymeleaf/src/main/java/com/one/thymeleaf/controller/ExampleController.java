package com.one.thymeleaf.controller;

import com.one.thymeleaf.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * @author One
 * @description
 * @date 2019/03/16
 */
@Controller
public class ExampleController {
    @RequestMapping("/string")
    public String string(ModelMap map) {
        map.addAttribute("userName", "ityouknow");
        return "string";
    }

    @RequestMapping("/if")
    public String ifunless(ModelMap map) {
        map.addAttribute("flag", "yes");
        return "if";
    }

    @RequestMapping("/list")
    public String list(ModelMap map) {
        map.addAttribute("users", getUserList());
        return "list";
    }

    private List<User> getUserList() {
        List<User> list = new ArrayList<User>();
        User user1 = new User("⼤大⽜牛", 12, "123456");
        User user2 = new User("⼩小⽜牛", 6, "123563");
        User user3 = new User("纯洁的微笑", 66, "666666");
        list.add(user1);
        list.add(user2);
        list.add(user3);
        return list;

    }
}
