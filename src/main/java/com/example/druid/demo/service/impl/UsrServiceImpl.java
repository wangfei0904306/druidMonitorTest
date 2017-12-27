package com.example.druid.demo.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.example.druid.demo.entity.Usr;
import com.example.druid.demo.mapper.UsrMapper;
import com.example.druid.demo.service.IUsrService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wangfei
 * @since 2017-12-28
 */
@Service
public class UsrServiceImpl extends ServiceImpl<UsrMapper, Usr> implements IUsrService {

}
