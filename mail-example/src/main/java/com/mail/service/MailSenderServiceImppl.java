package com.mail.service;

import org.apache.log4j.Logger;
import org.hibernate.service.spi.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mail.dao.MailDAO;
import com.mail.entity.MailEntity;
import com.mail.util.MailSenderUtil;
import com.sun.xml.internal.ws.util.UtilException;
@Service
public class MailSenderServiceImppl implements MailSenderService{
	
	private static final Logger logger = Logger.getLogger(MailSenderServiceImppl.class);



	private static final String subject = null;



	private static final String body = null;
	
	private static final String body1 = null;
	
	
	
	@Autowired
	private MailSenderUtil  mailSenderUtil;
	
	@Autowired
	private MailDAO dao;
	

	public MailSenderServiceImppl() {
		logger.info(this.getClass().getSimpleName() + "object is created");

	}
	
	public boolean sendMailToUser(String toEmailId) throws ServiceException {
		logger.info("------inside sendMail()" );
		boolean valid = false;
		
		if (toEmailId != null && toEmailId.length() > 10 && toEmailId.contains("@")) {
			logger.info("Entered Email Id length is valid");
			valid = true;
			if (valid && subject != null && subject.length() >= 4) {
				logger.info("Entered subject is length is valid");
				valid = true;
				if (valid && body != null && body.length() >= 5) {
					logger.info("Entered body length is valid");
					valid = true;
				} else {
					if (body == null && body.length() < 4) {
						logger.info("Not Valid:Body length is less than 4");
					}
				}
			} else {
				if (subject == null && subject.length() < 4) {
					logger.info("Not Valid:Subject length is less than 4");
				}
			}
		} else {
			if (toEmailId == null && toEmailId.length() < 10) {
				logger.info("Not Valid:Email Id length is less than 4");
			}
		}

		if (valid) {
			logger.info("inside getMessage()...Data is valid,Can Save in Database");
			
			MailEntity mailEntity = new MailEntity();
			//mailEntity.setId(id);
			mailEntity.setEmail(toEmailId);
			dao.save(mailEntity);
/*
			try {
				valid = util.sendMail(toEmailId, body, subject);
			} catch (UtilException e) {
				logger.info("Exception: " + e.getMessage());
			}*/

		} else {
			logger.info("inside getMessage()...Data is not saved in Database");
			valid = false;
		}
			
		return valid;
		
		
	}

	}
