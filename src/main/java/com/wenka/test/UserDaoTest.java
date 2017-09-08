package com.wenka.test;

import com.wenka.DaoImpl.UserDaoImpl;
import com.wenka.dao.UserDao;
import com.wenka.model.User;
import org.junit.Test;

/**
 * @author wenka
 * @date 17-9-8
 * @desc:
 */
public class UserDaoTest {

    private UserDao userDao = new UserDaoImpl();

    @Test
    public void testSave(){
        User user = new User("C", "cc", true, -1);
        User save = userDao.save(user);
        System.out.println(save);
    }

}
