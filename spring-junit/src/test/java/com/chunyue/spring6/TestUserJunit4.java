package com.chunyue.spring6;

import com.chunyue.spring6.junit.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:bean.xml")
public class TestUserJunit4 {

    @Autowired
    private User user;

    @Test
    public void testUserObject() {
        System.out.println(user);
        user.add();
    }

}
