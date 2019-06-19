package com.demo.login;

import com.demo.common.model.User;
import com.jfinal.plugin.activerecord.Page;
import com.jfinal.plugin.activerecord.Record;

/*
*
* */
public class LoginService {
    private User dao = new User().dao();

    //查询所有用户信息
    public Page<User> paginate(int pageNumber, int pageSize) {
        return dao.paginate(pageNumber,pageSize,"select *","from user");
    }


    //按照id进行查找
    public User findById(int id) {
        return dao.findById(id);
    }

    //按照id 进行删除
    public void deleteById(int id) {
        dao.deleteById(id);
    }
}
