package com.rxoffice.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rxoffice.entity.MstUserInfo;

@Repository
public class MstUserInfoImpl implements MstUserInfoDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public boolean addUser(MstUserInfo userInfo) {
		sessionFactory.getCurrentSession().save(userInfo);
		return false;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<MstUserInfo> getUserList() {
		
		return (List<MstUserInfo>)sessionFactory.getCurrentSession().createQuery("from MstUserInfo").list();
		
	}

	@Override
	public boolean deleteUser(Integer id) {
		return false;
	}

	@Override
	public boolean authenticateUser(MstUserInfo userInfo) {
		int counter = 0;
		boolean isUser = false;
		Query query = sessionFactory.getCurrentSession().createQuery("SELECT * FROM MstUserInfo WHERE UserID = ? AND Password = ? ");
		query.setString(++counter, userInfo.getUserId());
		query.setString(++counter, userInfo.getPassword());
		if(query.list().size() > 0)
			isUser = true;
		
		return isUser;
	}
	
}
