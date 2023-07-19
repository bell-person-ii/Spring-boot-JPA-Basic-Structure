package com.jong.blog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
import com.jong.blog.Member.*;



@RestController
public class TestController {

    @Autowired
    TestService testService;

    @GetMapping("/test")
    public List<Member>getAllMembers(){
        List<Member> members = testService.getAllMembers();
        return members;
    }

}
