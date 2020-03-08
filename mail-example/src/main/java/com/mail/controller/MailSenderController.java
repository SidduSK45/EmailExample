package com.mail.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
@RequestMapping("/")
public class MailSenderController {
	private static final Logger logger = Logger.getLogger(MailSenderController.class);
	
	public MailSenderController() {
		logger.info(this.getClass().getSimpleName() + "object is created");
	}
	
	public ModelAndView sendMail(String emailId) {
		
		logger.info("------inside sendMail()");
		return null;
	}
	

}
