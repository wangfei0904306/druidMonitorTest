package com.example.druid.demo.web;


import com.example.druid.demo.entity.Usr;
import com.example.druid.demo.service.IUsrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author wangfei
 * @since 2017-12-28
 */
@RestController
@RequestMapping("/test/usr")
public class UsrController {

    @Autowired
    private IUsrService iUsrService;

    @GetMapping("/add")
    public Integer add(){

        Usr usr = new Usr();
        usr.setUsername(System.currentTimeMillis() + "");
        iUsrService.insert(usr);
        return usr.getId();
    }

}

