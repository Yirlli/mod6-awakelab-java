package services;

import domain.Product;

public interface ProductService {
//para exponer servicios lo ideal es que sea una interface para aplicar solo metodos
	
	
	//iterar los objetos para listar los productos
	Iterable<Product> listAllProducts();
	
	//busqueda por id
	
	
	//para aplicar la busqueda indigamos el tipo de dato y el dato que estamos buscando
	Product getProductById(Integer id);
	
	
	//para guardar el producto guardarmos una instancia del objeto
	Product saveProduct(Product product);
}
