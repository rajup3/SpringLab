package com.rp3.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rp3.dao.MstUserInfoDAO;
import com.rp3.entity.MstUserInfo;

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
