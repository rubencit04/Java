package es.upgrade.main;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import es.upgrade.config.config;
import es.upgrade.modelo.entidad.Ordenador;

@SpringBootApplication
public class main {
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(config.class, args);
		
		Ordenador o = context.getBean("ordenador",Ordenador.class);
		
		System.out.println(o);
		
	}

}
