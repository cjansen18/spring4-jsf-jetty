package com.mkyong.user.bo.impl;

import javax.inject.Named;

import com.mkyong.user.bo.UserBo;

@Named
public class UserBoImpl implements UserBo{
 
	public String getMessage() {
		
		return "Message from JSF 2 + Spring Integration backend!";
	
	}
 
}