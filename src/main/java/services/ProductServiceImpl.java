package services;

import org.springframework.beans.factory.annotation.Autowired;

import domain.Product;
import repositories.ProductRepository;

public class ProductServiceImpl implements ProductService {
	
	//aplicamos los metodos del crud
	
	
	//llamamos a la entidad repositorio para trabajar con ella en el crud esta trabaja directamente con la BD de las query
	private ProductRepository productRepository;
	
	//traemos sus metodos haciendo una especie de constructor instanciando el producto repositorio 
	
	
	//se crea una anotacion para controlarla
	@Autowired
	public void setProductRepository(ProductRepository productRepository) {
		this.productRepository = productRepository;
		
	}

	
	//ahora para los metodos creados en la interface vamos a llamar al product repositorio ya que genera las quwery
	@Override
	public Iterable<Product> listAllProducts() {
		// TODO Auto-generated method stub
		return productRepository.findAll();
	}

	@Override
	public Product getProductById(Integer id) {
		// TODO Auto-generated method stub
		return productRepository.findById(id).orElse(null); //el or else indica que si no lo encuentre oor id sea null 
	}

	@Override
	public Product saveProduct(Product product) {
		// TODO Auto-generated method stub
		return productRepository.save(product);
	}

}
