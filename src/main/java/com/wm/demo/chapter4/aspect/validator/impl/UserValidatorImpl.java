package com.wm.demo.chapter4.aspect.validator.impl;


import com.wm.demo.chapter4.aspect.validator.UserValidator;
import com.wm.demo.chapter4.pojo.User;

public class UserValidatorImpl implements UserValidator {

	@Override
	public boolean validate(User user) {
		System.out.println("引入新的接口："+ UserValidator.class.getSimpleName());
		return user != null;
	}

}
