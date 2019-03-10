package com.example.es.Controller;

import com.example.es.entity.UserEntity;
import com.example.es.repository.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    private UserDao userDao;

    //@requestBody注解常用来处理application/json
    @RequestMapping("/addUser")
    public UserEntity addUser(@RequestBody UserEntity userEntity) {
        return userDao.save(userEntity);
    }

    //查询文档
    @RequestMapping("/findById")
    public Optional<UserEntity> findById(String id) {
        return userDao.findById(id);
    }
}
