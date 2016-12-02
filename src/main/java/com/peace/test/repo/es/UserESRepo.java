package com.peace.test.repo.es;

import com.peace.test.domain.User;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

/**
 * Created by mind on 17/10/2016.
 */
interface UserESRepo extends ElasticsearchRepository<User, Long> {
    List<User> findByNickname(String name);
}
