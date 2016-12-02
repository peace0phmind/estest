package com.peace.test.repo.jpa;

import com.peace.test.domain.User;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by mind on 18/10/2016.
 */
public interface UserJPARepo extends PagingAndSortingRepository<User, Long> {

    User findByMobile(String mobile);
}
