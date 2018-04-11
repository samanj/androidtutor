package com.samuel.annotations;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class HobbyValidator implements ConstraintValidator<IsValidHobby, String> {

	@Override
	public void initialize(IsValidHobby isValidHobby) {
		// TODO Auto-generated method stub
		
		
		
	}

	@Override
	public boolean isValid(String studentHobby, ConstraintValidatorContext ctx) {
		// TODO Auto-generated method stub
		
		if(studentHobby==null) {
			return false;
		}
		if(studentHobby.matches("Music|Football|Cricket|Hockey")){
			return true;
		}
		return false;
		
	}

}
