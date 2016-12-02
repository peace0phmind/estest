package com.peace.test.repo.es;

import com.peace.test.AbstractBaseTest;
import com.peace.test.domain.Topic;
import com.peace.test.domain.User;
import com.peace.test.repo.jpa.UserJPARepo;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by mind on 17/10/2016.
 */
@Slf4j
public class UserESRepoTest extends AbstractBaseTest {

    @Autowired
    private UserESRepo userESRepo;

    @Autowired
    private UserJPARepo userJPARepo;

    @Autowired
    private TopicESRepo topicESRepo;

    @Test
    public void findByNickname() throws Exception {
        List<User> users = userESRepo.findByNickname("彭毅");
        for (User user : users) {
            log.info("{}", user);
        }

        userJPARepo.findAll();
    }

    @Test
    public void saveTopics() {
        List<Topic> topics = new ArrayList<>();

        topics.add(new Topic(1L, "111"));
        topics.add(new Topic(2L, "222"));
        topics.add(new Topic(3L, "333"));
        topics.add(new Topic(4L, "444"));
        topics.add(new Topic(5L, "555"));
        topics.add(new Topic(6L, "666"));
        topics.add(new Topic(7L, "777"));
        topics.add(new Topic(8L, "888"));

        topicESRepo.save(topics);
    }
}
