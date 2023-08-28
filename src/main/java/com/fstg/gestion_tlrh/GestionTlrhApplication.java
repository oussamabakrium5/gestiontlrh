package com.fstg.gestion_tlrh;


import com.fstg.gestion_tlrh.service.EmailSenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
//import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GestionTlrhApplication {

//	@Autowired
//	private EmailSenderService senderService;

	public static void main(String[] args) {

		SpringApplication.run(GestionTlrhApplication.class, args);
	}


	//@EventListener(ApplicationReadyEvent.class)
	//public void sendMessage(){
		//senderService.sendemail("younesakel892@gmail.com","this is a subject","this is a body");
	//}

}
