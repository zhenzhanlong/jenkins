package com.jenkins.api;

import java.util.List;

import com.jenkins.model.UserVO;

public interface IUserApi {

	public List<UserVO> getUserList(int num);
}
