package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import domain.Product;
import services.ProductService;


@Controller
public class ProductController {
	
	private ProductService productService;
	
	
	
	
	//la propiedad Model model permite trabajar con los modelos es decir con las clases instanciadas
	
	@Autowired
	public void setProductService(ProductService productService) {
		this.productService = productService;
	}
	
	
	@RequestMapping(value="/products", method= RequestMethod.GET)
	public String list(Model model) {
		model.addAttribute("products", productService.listAllProducts());
		System.out.println("Retorno productos lista :");
		return "products";
	}
	
	@RequestMapping("products/{id}")
	public String showProduct(@PathVariable Integer id, Model model) {
		model.addAttribute("products", productService.getProductById(id));
		return "productshow";
	}
	@RequestMapping("products/edit/{id}")
	public String edit(@PathVariable Integer id, Model model) {
		model.addAttribute("products", productService.getProductById(id));
		return "productForm";
	}
	@RequestMapping("product/new")
	public String newProduct(Model model) {
		model.addAttribute("product", new Product());
		return "productForm";
	}
	@RequestMapping(value="product", method= RequestMethod.POST)
	public String saveProduct(Product product) {
		productService.saveProduct(product);
		return "redirect:/product/"+ product.getId();
	}
}
