package com.rp3.service;

import com.rp3.entity.MstUserInfo;

public interface MstUserInfoService {

	public boolean addUser(MstUserInfo userInfo);
	public boolean authenticateUser(MstUserInfo userInfo);
	
	
}
