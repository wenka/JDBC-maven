package com.wenka.test;

import com.wenka.DaoImpl.UserDaoImpl;
import com.wenka.dao.UserDao;
import com.wenka.model.User;
import org.junit.Test;

import java.util.List;

/**
 * @author wenka
 * @date 17-9-8
 * @desc:
 */
public class UserDaoTest {

    private UserDao userDao = new UserDaoImpl();

    @Test
    public void testGet(){
        User user = userDao.get("94dea194a-62d3--95a0-c26fddafb51");
        System.out.println(user);
    }

    @Test
    public void testSave() {
        User user = new User("D", "dd", true, -1);
        User save = userDao.save(user);
        System.out.println(save);
    }

    @Test
    public void testList() {
        List<User> list = userDao.list("");
        for (User u : list) {
            System.out.println(u);
        }
    }

    @Test
    public void testDelete(){
        User delete = userDao.delete("ef632271-dd1a-4673-8674-042bff24b702");
        System.out.println(delete);
    }

    @Test
    public void testUpdate(){
        User user = userDao.get("7adfb608-9357-4253-a550-8fa37243664c");
        user.setUsername("E");
        User update = userDao.update(user);
        System.out.println(update);
    }
}
