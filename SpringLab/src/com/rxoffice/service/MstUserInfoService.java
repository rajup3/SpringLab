package com.rxoffice.service;

import com.rxoffice.entity.MstUserInfo;

public interface MstUserInfoService {

	public boolean addUser(MstUserInfo userInfo);
	public boolean authenticateUser(MstUserInfo userInfo);
	
	
}
