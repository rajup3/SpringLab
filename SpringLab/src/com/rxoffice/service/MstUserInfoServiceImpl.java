package com.rxoffice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rxoffice.dao.MstUserInfoDAO;
import com.rxoffice.entity.MstUserInfo;

@Service
public class MstUserInfoServiceImpl implements MstUserInfoService {

	@Autowired
	MstUserInfoDAO userDAO;
	
	@Transactional
	public boolean addUser(MstUserInfo userInfo) {
		
		return userDAO.addUser(userInfo);
	}
	
	@Transactional
	public boolean authenticateUser(MstUserInfo userInfo){

		return userDAO.authenticateUser(userInfo);
	}

}
