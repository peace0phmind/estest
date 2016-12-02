package com.peace.test.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.elasticsearch.annotations.Document;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by mind on 17/10/2016.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "t_user")
@Document(indexName = "base", type = "user")
public class User implements Serializable {
    @Id
    private Long id;

    private String nickname;

    private String mobile;
}
