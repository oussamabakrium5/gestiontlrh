package com.fstg.gestion_tlrh.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailSenderService {

    @Autowired
    private static JavaMailSender sendmail;//joue le role de serveur de messagerie

    public static void sendemail(String toEmail, String subject, String body){
        SimpleMailMessage message= new SimpleMailMessage();//l'outil pour ecrire notre message

        message.setFrom("younesakel16@gmail.com");//emetteur
        message.setTo(toEmail);//recepteur
        message.setSubject(subject);//sujet
        message.setText(body);//contenue du message

        sendmail.send(message);//envoyé me message avec le serveur de messagerie

        System.out.println("mail sent succsfully");
    }

}
