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
 * spring ����������
 * 
 * @author lenovo
 *
 */
@RestController
@RequestMapping("/base")
public class BaseController {
	/**
	 * ��־
	 */
	private Logger log = LoggerFactory.getLogger(this.getClass());

	@Autowired
	protected HttpServletRequest request;
	@Autowired
	protected HttpServletResponse response;
	
	protected Validator validate;

	/*** �û���¼��ʱ�������µ�¼ ***/
	@RequestMapping(value = "/notHaveLogin")
	public String notHaveLogin() {
		log.info("�û��������µ�¼");
		UserVO userVO = new UserVO();
		userVO.setUserName(StringUtils.link("aa", "bb"));
		userVO.setPassword("����");
		return "YES_I_DO"+userVO;
	}

}
