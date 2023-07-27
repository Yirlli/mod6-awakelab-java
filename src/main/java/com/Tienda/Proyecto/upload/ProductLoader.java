package com.Tienda.Proyecto.upload;


import java.math.BigDecimal;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.Tienda.Proyecto.domain.Product;
import com.Tienda.Proyecto.repositories.ProductRepository;


@Component
public class ProductLoader implements ApplicationListener<ContextRefreshedEvent> {
	
	private ProductRepository productRepository;
	
	private Logger log = LogManager.getLogger(ProductLoader.class);

	@Autowired
	public void setProductRepository(ProductRepository productRepository) {
		this.productRepository = productRepository;
		
	}

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		// TODO Auto-generated method stub
		Product shirt = new Product();
		shirt.setDescription("Spring Polera");
		shirt.setPrice(new BigDecimal("12.56"));
		shirt.setProductId("20230001");
		productRepository.save(shirt);
		
		log.info("Save exito -id" + shirt.getId());
		
		
	}

}
