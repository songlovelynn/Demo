package com.example.demo.modules.sys.service.impl;

import com.example.demo.modules.sys.entity.User;
import com.example.demo.modules.sys.mapper.UserMapper;
import com.example.demo.modules.sys.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Louchen
 * @since 2019-03-21
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
