package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import modelo.entidad.Ordenador;

public class main {
	public static ApplicationContext context;
	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("contex01.xml");
		Ordenador o = context.getBean("Ordenador",Ordenador.class);
		System.out.println(o);
	}

}
