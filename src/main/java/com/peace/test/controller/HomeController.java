package com.peace.test.controller;

import com.peace.test.domain.User;
import com.peace.test.repo.jpa.UserJPARepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * Created by mind on 02/12/2016.
 */
@Slf4j
@RestController
public class HomeController {

    @Autowired
    private RestTemplate restTemplate;

    @Resource(name = "redisTemplate")
    private HashOperations ho;

    @Autowired
    private UserJPARepo userJPARepo;

    @RequestMapping("/")
    public String home() {
        Long number = ho.increment("py", "test", 1);
        log.info("increment result {}", number);
        return "hello word!";
    }

    @RequestMapping("/user")
    public User getUser() {
        restTemplate.getForObject("http://localhost:8080", String.class);
        return userJPARepo.findByMobile("18114015690");
    }
}
