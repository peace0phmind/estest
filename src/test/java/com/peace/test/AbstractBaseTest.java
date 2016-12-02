package com.peace.test;

import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by mind on 17/10/2016.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ActiveProfiles("autotest")
@SpringApplicationConfiguration(classes = ApplicationTest.class)
public class AbstractBaseTest {
}
