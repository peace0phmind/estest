package com.peace.test.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.elasticsearch.annotations.Document;

/**
 * Created by mind on 17/10/2016.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(indexName = "newbase", type = "topic")
public class Topic {

    private Long id;

    private String content;
}
