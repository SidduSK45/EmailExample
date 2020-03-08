package com.mail.service;

import com.google.protobuf.ServiceException;

public interface MailSenderService {
	public boolean sendMailToUser(String toEmailId ) throws ServiceException, Exception;
	

}
