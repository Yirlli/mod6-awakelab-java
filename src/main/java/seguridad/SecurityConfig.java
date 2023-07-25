package seguridad;


import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
//dar propiedad a la aplicacion
//en cuanto a los request
	//corresponde al manejo del spring security se maneja con herencia
	
	@Override
	protected void configure(HttpSecurity httpsecurity) throws Exception{
		httpsecurity.authorizeRequests().antMatchers("/").permitAll().and().authorizeRequests().antMatchers("/console/**");
		httpsecurity.csrf().disable();
		httpsecurity.headers().frameOptions().disable();
	}
}
