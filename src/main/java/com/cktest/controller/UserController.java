package com.cktest.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.cktest.common.result;
import com.cktest.mapper.UserMapper;
import com.cktest.pojo.User;
import com.cktest.service.UserService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 周周
 * @since 2020-05-21
 */
@RestController
@RequestMapping("/user")
@Api("用户标题")
public class UserController {
	@Autowired
	UserService  userService;
	@Autowired
	UserMapper  userMapper;
	@RequestMapping("/zhuche")
	@ApiOperation(value="注册",httpMethod="GET")
	public result zhuche(String emial,String password){
		User user=new User();
		user.setEmial(emial);
		user.setPassword(password);
		boolean u=	userService.save(user);
		result r=new result();
		r.setMes("注册成功");
		r.setStatu(200);
		return r;
		
	}
	@RequestMapping("/quchong")
	public result quchong(String emial,String password){
		result r=new result();
		List<User> list=userMapper.findAll();
		for(int i=0;list.size()<i;i++){
    String emial1=list.get(i).getEmial();
    String password1=list.get(i).getPassword();
    
    if(emial.equals(emial1)&password.equals(password1)){
    	r.setMes("不好意思你的账号或者密码有问题");
    	r.setData(password1 + emial1);
    	
    }
    else{
    	zhuche(emial,password);
    }
		}
		return r;
	}
	
	

}
