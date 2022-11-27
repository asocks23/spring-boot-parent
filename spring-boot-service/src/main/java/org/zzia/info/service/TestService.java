package org.zzia.info.service;

import org.springframework.stereotype.Service;
import org.zzia.info.utils.TestUtils;

@Service
public class TestService {
    public void testMethod(){
        TestUtils.test();
    }
}
