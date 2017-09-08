package com.wenka.DaoImpl;

import com.wenka.model.User;
import com.wenka.dao.UserDao;
import com.wenka.util.JDBCUtil;

import java.sql.*;
import java.util.List;

/**
 * @author wenka
 * @date 17-9-8
 * @desc:
 */
public class UserDaoImpl implements UserDao {
    /**
     * 根据id查询用户详情
     *
     * @param id
     * @return
     */
    public User get(String id) {

        Connection connection = JDBCUtil.getConnection();
        PreparedStatement preparedStatement = null;
        User user = null;
        try {
            preparedStatement = connection.prepareStatement("SELECT user.* FROM user WHERE id = ?");
            preparedStatement.setString(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                user = new User();
                user.setId(resultSet.getString("id"));
                user.setUsername(resultSet.getString("username"));
                user.setPassword(resultSet.getString("password"));
                user.setCreateTime(resultSet.getDate("create_time"));
                user.setActive(resultSet.getBoolean("active"));
                user.setStatus(resultSet.getInt("status"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.close(preparedStatement, connection);
        }

        return user;
    }

    /**
     * 条件查询用户集合
     *
     * @param param
     * @return
     */
    public List<User> list(String param) {
        return null;
    }

    /**
     * 根据主键删除用户
     *
     * @param id
     * @return
     */
    public User delete(String id) {
        return null;
    }

    /**
     * 保存
     *
     * @param user
     * @return
     */
    public User save(User user) {
        Connection connection = JDBCUtil.getConnection();
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement("INSERT INTO user (id,username,password,create_time,active,status) VALUES (?,?,?,?,?,?)");
            preparedStatement.setString(1, user.getId());
            preparedStatement.setString(2, user.getUsername());
            preparedStatement.setString(3, user.getPassword());
            preparedStatement.setDate(4, new Date(user.getCreateTime().getTime()));
            preparedStatement.setBoolean(5, user.isActive());
            preparedStatement.setInt(6, user.getStatus());

            preparedStatement.execute();

            return user;
        } catch (SQLException e) {
            e.printStackTrace();
            JDBCUtil.rollback();
        } finally {
            JDBCUtil.close(preparedStatement, connection);
        }

        return null;
    }

    /**
     * 修改
     *
     * @param user
     * @return
     */
    public User update(User user) {
        return null;
    }
}
