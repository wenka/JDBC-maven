package com.wenka.dao;

import com.wenka.model.User;

import java.sql.SQLException;
import java.util.List;

/**
 * @author wenka
 * @date 17-9-8
 * @desc:
 */
public interface UserDao {

    /**
     * 根据id查询用户详情
     *
     * @param id
     * @return
     */
    public User get(String id);

    /**
     * 条件查询用户集合
     *
     * @param param
     * @return
     */
    public List<User> list(String param);

    /**
     * 根据主键删除用户
     *
     * @param id
     * @return
     */
    public User delete(String id);

    /**
     * 保存
     *
     * @param user
     * @return
     */
    public User save(User user);

    /**
     * 修改
     *
     * @param user
     * @return
     */
    public User update(User user);
}
