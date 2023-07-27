package com.Tienda.Proyecto.seguridad;

import org.h2.server.web.WebServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class WebConfiguration  {
	
	//lo que va a interactuar con la base de datos
	
	@Bean
	ServletRegistrationBean h2servletRegistration() {
		
		ServletRegistrationBean registrationBean = new ServletRegistrationBean(new WebServlet());
		registrationBean.addUrlMappings("/console/*");
		
		return registrationBean;
	}

}
