package com.chunyue.spring6.iocxml.exampleinterface;

public class UserDaoImpl implements UserDao {

    @Override
    public void run() {
        System.out.println("UserDaoImpl running...");
    }
}
