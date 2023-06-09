package com.odontologia.ProyectoIntegrador;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Connection;
import java.sql.DriverManager;

@SpringBootApplication
public class ProyectoIntegradorApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(ProyectoIntegradorApplication.class);

	public static void main(String[] args) {

		Connection connection = null;

		try {
			Class.forName("org.h2.Driver");
			connection = DriverManager.getConnection("jdbc:h2:~/proyectoIntegrador;INIT=RUNSCRIPT FROM 'create.sql'", "sa", "sa");

		} catch (Exception e){
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (Exception ex){
				ex.printStackTrace();
			}
		}

		SpringApplication.run(ProyectoIntegradorApplication.class, args);
		LOGGER.info("Integrador is now running ...");


	}

}
