package cn.fictio.myweb.controller;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import cn.fictio.myweb.pojo.User;
import cn.fictio.myweb.service.UserService;

@Controller
@RequestMapping(value = "/user")
public class UserController {
	
	@Resource
	private UserService userService;
	
	private static Logger logger = 
			LoggerFactory.getLogger(UserController.class);
	
	//host:8080/.../user/login?userName=张三&password=123
	/*
	 * 用户登录
	 */
	@RequestMapping(value = "/login",method=RequestMethod.GET)
	public String userLogin(@RequestParam("userName")String userName,
			@RequestParam("password")String password){
		User u = new User();
		u.setUserName(userName);
		u.setPassword(password);
		logger.info("login user={}",u);
		boolean isSuccess = userService.login(u);
		if (isSuccess){
			System.out.println("login sucess!");
			return "loginSuceess";
		} else {
			System.out.println("login failed");
			return "error";
		}
	}
	
	/*
	 * 用户注册
	 */
	@RequestMapping(value="/signUp",method=RequestMethod.GET)
	public String signUp(@RequestParam("userName")String userName,
			@RequestParam("password") String password){
		
		User u = new User();
		u.setPassword(password);
		u.setUserName(userName);
		
		
		logger.info("signUp user={}",u);
		
		boolean signSucess = userService.signUp(u);
		if (signSucess){
			return "loginSuceess";
		}else {
			return "error";
		}
	}
	
	/*
	 * 用户注销
	 */
	@RequestMapping(value="/delete",method=RequestMethod.GET)
	public String deleteUser(@RequestParam("userName")String userName,
			@RequestParam("password") String password){
		
		User u = new User();
		u.setPassword(password);
		u.setUserName(userName);
		
		logger.info("delete user={}",u);
		
		boolean signSucess = userService.deleteUser(u);
		if (signSucess){
			return "sucess";
		}else {
			return "failure";
		}
	}
	
	/*
	 * 用户更改密码
	 */
	@RequestMapping(value="/replace/password",method=RequestMethod.GET)
	public String updatePassword(@RequestParam("userName")String userName,
			@RequestParam("password") String password){
		User u = new User();
		u.setPassword(password);
		u.setUserName(userName);
		logger.info("replace user={}",u);
		
		boolean signSucess = userService.updatePassword(u);
		if (signSucess){
			return "sucess";
		}else {
			return "failure";
		}
	}
	
	@RequestMapping(value="/test" ,method=RequestMethod.POST)
	public String test(@RequestBody User u){
		logger.info("test user={}",u);
		return "sucess";
	}
}
