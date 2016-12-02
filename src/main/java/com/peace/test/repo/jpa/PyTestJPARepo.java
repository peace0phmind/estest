package com.peace.test.repo.jpa;

import com.peace.test.domain.PyTest;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by mind on 21/11/2016.
 */
public interface PyTestJPARepo extends PagingAndSortingRepository<PyTest, Long> {
}
