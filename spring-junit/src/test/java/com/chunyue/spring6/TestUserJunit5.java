package com.chunyue.spring6;

import com.chunyue.spring6.junit5.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(locations = "classpath:bean.xml")
public class TestUserJunit5 {

    @Autowired
    private User user;

    @Test
    public void testUserObject() {
        System.out.println(user);
        user.add();
    }
}
