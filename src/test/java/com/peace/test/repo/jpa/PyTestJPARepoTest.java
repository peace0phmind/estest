package com.peace.test.repo.jpa;

import com.peace.test.AbstractBaseTest;
import com.peace.test.domain.PyTest;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by mind on 21/11/2016.
 */
@Slf4j
public class PyTestJPARepoTest extends AbstractBaseTest {
    @Autowired
    private PyTestJPARepo pyTestJPARepo;

    @Test
    public void testBatchInsert() {
        List<PyTest> pytests = new ArrayList<>();

        pytests.add(new PyTest(0L, "1"));
        pytests.add(new PyTest(0L, "2"));
        pytests.add(new PyTest(0L, "3"));
        pytests.add(new PyTest(0L, "4"));

        pyTestJPARepo.save(pytests);

        log.info("{}", pytests);
    }
}