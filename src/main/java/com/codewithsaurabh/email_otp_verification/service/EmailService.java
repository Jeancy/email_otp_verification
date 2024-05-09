package com.codewithsaurabh.email_otp_verification.service;

import jakarta.mail.Authenticator;
import jakarta.mail.Message;
import org.springframework.stereotype.Service;

import jakarta.mail.PasswordAuthentication;
import jakarta.mail.Session;
import jakarta.mail.Transport;
import jakarta.mail.internet.AddressException;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;
import java.util.Properties;

@Service
public class EmailService {
    
    public static void sendEmail(String recepient,String subject, String body) throws Exception {

        Properties properties=new Properties();
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");
        String myAccountEmail="jeancyts@gmail.com";
        String password="nypzqfrnsgvemvmg";
        Session session=Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(myAccountEmail, password);
            }
        });

        Message message=prepareMessage(session,myAccountEmail,recepient,subject, body);
        Transport.send(message);
        System.out.println("Message Sent successfully");
    }

    private static Message prepareMessage(Session session, String from, String to, String orderInfo, String body) {
        Message message = new MimeMessage(session);
        try {

            message.setFrom(new InternetAddress(from));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(to));
            message.setSubject(orderInfo);
            message.setText(body);
            return message;
        } catch (AddressException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    
    }
}
