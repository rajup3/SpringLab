package com.rp3.dao;

import java.util.List;

import com.rp3.entity.MstUserInfo;


public interface MstUserInfoDAO {

	
	public boolean addUser(MstUserInfo userInfo);
	public List<MstUserInfo> getUserList();
	public boolean deleteUser(Integer id);
	public boolean authenticateUser(MstUserInfo userInfo);
}
