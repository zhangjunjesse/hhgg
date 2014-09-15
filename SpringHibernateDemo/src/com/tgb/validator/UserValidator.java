package com.tgb.validator;

import java.util.HashSet;
import java.util.Set;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.tgb.entity.User;

public class UserValidator implements Validator{

	
	private static Set<String> FORBINDDEN_WORD_SET = new HashSet<String>();
	
	static{
		FORBINDDEN_WORD_SET.add("习近平");
		FORBINDDEN_WORD_SET.add("fuck");
	}
	@Override
	public boolean supports(Class<?> arg0) {
		// TODO Auto-generated method stub
		return User.class==arg0;
	}

	@Override
	public void validate(Object arg0, Errors arg1) {
		ValidationUtils.rejectIfEmpty(arg1, "userName", "userName.not.empty");
		ValidationUtils.rejectIfEmpty(arg1, "age", "age.not.empty");
		User user = (User)arg0;
		for(String forbidden : FORBINDDEN_WORD_SET){
			if(user.getUserName().contains(forbidden)){
				arg1.rejectValue("userName", "userName.forbidden",new Object[]{forbidden},"您的用户名包含敏感词汇");
				break;
			}
		}
		
	}

	
}
