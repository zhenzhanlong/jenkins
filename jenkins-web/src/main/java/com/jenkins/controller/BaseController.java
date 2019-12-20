package com.jenkins.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jenkins.model.UserVO;

import jenkins.common.utils.StringUtils;

/**
 * spring 基础控制器
 * 
 * @author lenovo
 *
 */
@RestController
@RequestMapping("/base")
public class BaseController {
	/**
	 * 日志
	 */
	private Logger log = LoggerFactory.getLogger(this.getClass());

	@Autowired
	protected HttpServletRequest request;
	@Autowired
	protected HttpServletResponse response;
	
	protected Validator validate;

	/*** 用户登录超时，请重新登录 ***/
	@RequestMapping(value = "/notHaveLogin")
	public String notHaveLogin() {
		log.info("用户登请重新登录");
		UserVO userVO = new UserVO();
		userVO.setUserName(StringUtils.link("aa", "bb"));
		userVO.setPassword("明文");
		return "YES_I_DO"+userVO;
	}

}
