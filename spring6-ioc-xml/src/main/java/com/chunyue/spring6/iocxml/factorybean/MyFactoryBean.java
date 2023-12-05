package com.chunyue.spring6.iocxml.factorybean;

import com.chunyue.spring6.iocxml.User;
import org.springframework.beans.factory.FactoryBean;

public class MyFactoryBean implements FactoryBean<User> {
    @Override
    public User getObject() throws Exception {
        return new User();
    }

    @Override
    public Class<?> getObjectType() {
        return User.class;
    }
}
