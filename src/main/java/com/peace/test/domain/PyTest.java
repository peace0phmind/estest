package com.peace.test.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by mind on 21/11/2016.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "t_pytest")
public class PyTest implements Serializable {
    @Id
    private Long id;

    private String name;
}
