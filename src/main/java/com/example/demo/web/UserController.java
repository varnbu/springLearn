package com.example.demo.web;

import com.example.demo.domain.User;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping(value = "/users")
public class UserController {
    static Map<Long, User> users = Collections.synchronizedMap(new HashMap<Long, User>());

    @GetMapping("/")
    public List<User> getUseList() {
        List<User> r = new ArrayList<User>(users.values());
        return r;
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable Long id) {
        return users.get(id);
    }

    @PostMapping("/")
    public String postUser(@RequestBody User user) {
        users.put(user.getId(), user);
        return "{\"result\":\"success\"}";
    }

    @RequestMapping("/test")
    public String test() {
        return "user test";
    }
}
