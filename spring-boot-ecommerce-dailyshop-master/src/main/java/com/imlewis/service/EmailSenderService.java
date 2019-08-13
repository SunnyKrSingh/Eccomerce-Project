package com.imlewis.service;

import com.imlewis.model.AppUser;

public interface EmailSenderService {

	void sendActiveCode(AppUser appUser);
	
	void sendResetPasswordCode(AppUser appUser);
}
