package com.ecm.service;

import com.ecm.entity.AppUser;

public interface EmailSenderService {

	void sendActiveCode(AppUser customer);
	
	void sendResetPasswordCode(AppUser customer);
}
