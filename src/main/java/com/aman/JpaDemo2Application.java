package com.aman;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.aman.service.DBOperation;

@SpringBootApplication
@EnableJpaRepositories
public class JpaDemo2Application {

	public static void main(String[] args) {
	ApplicationContext context = 	SpringApplication.run(JpaDemo2Application.class, args);
		 
	DBOperation d =  context.getBean(DBOperation.class);
	//d.addAlltudentDetails();
//	d.updateDetails();
		
		//d.gettAllData();
		//d.getAllJpqlData();
		d.getIndex(24 );
		//d.getTwovalue("Amam", "Khariar");
	}

}
