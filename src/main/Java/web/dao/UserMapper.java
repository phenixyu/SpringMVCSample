package web.dao;

import web.model.User;

/**
 * Created by asus on 2017/1/19.
 */
public interface UserMapper {
    User selectByPrimaryKey(Long id);
}
