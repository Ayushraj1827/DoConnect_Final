package com.DoConnect.services;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailSenderServiceImpl implements EmailSenderService {
	
	private final JavaMailSender mailSender;
    
	@Override
	public void sendEmail(String to, String subject, String message) {
		SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setFrom("adminnn@gmail.com");
        simpleMailMessage.setTo("s160608@rguktsklm.ac.in");
        simpleMailMessage.setSubject("New Question or answer posted");
        simpleMailMessage.setText("need approval for the new question or answer");

        this.mailSender.send(simpleMailMessage);

		
	}

	public EmailSenderServiceImpl(JavaMailSender mailSender) {
		super();
		this.mailSender = mailSender;
	}
	

}
