package com.cursoJavaEx.project_spring_desktop.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Properties;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cursoJavaEx.projectSpringDesktop.dao.DisqueraDao;

class SpringDesktopTest {

	@Test
	void testContext() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		assertNotNull(context);
		
		DisqueraDao disqueraDao = (DisqueraDao) context.getBean("disqueraDaoBean");
		assertNotNull(disqueraDao);
		
		DisqueraDao disqueraDaoNuevo = (DisqueraDao) context.getBean("disqueraDaoBean");
		
		System.out.println("Contexto cargado correctamente");
		System.out.println(disqueraDao);
		System.out.println(disqueraDaoNuevo);
		
		//:::::::::::::: PROPERTIES :::::::::::::::::::
		
		Properties properties =  (Properties) context.getBean("properties");
		
		System.out.println(properties.get("spring-username"));
	}

}
