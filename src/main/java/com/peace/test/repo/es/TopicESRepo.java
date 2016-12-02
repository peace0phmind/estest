package com.peace.test.repo.es;

import com.peace.test.domain.Topic;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Created by mind on 19/10/2016.
 */
public interface TopicESRepo extends ElasticsearchRepository<Topic, Long> {
}
