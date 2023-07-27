package com.Tienda.Proyecto.repositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Tienda.Proyecto.domain.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer > {
	
	//el crud repositorio es una libreria 
	//aplicamos un valor de lista que corresponde al product, y se ubica a traves del ID que seroa un valor integer
	
	

}
