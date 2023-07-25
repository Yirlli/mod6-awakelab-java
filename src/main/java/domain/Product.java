package domain;

import java.math.BigDecimal;
import javax.persistence.*;

@Entity
public class Product {
	
	//estructura abstracta
	@Id
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	
	//es importante colocar las anotaciones junto a los atributos que se les va a aplicar
	//se indica una induccion automatica para que tenga una proteccion
	//indica el tipo automatico se gestiona solo, aplica para el auto-increment en este caso del ID

	@Version
	private Integer version;
	
	//la version indica el tipo de dato de texto que vaa versionando cada ingreso solo porq es texto
	
	private String productId;
	private String description;
	private String imageUrl;
	private BigDecimal price;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getVersion() {
		return version;
	}
	public void setVersion(Integer version) {
		this.version = version;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	
	//para aplicar la persistencia se habla de una condicion nueva que permite trabajar sobre el concepto de base de datos
	//concepto de identidades, se agregan componetes en em pom: dependencias JPA
	
	//se indica con una identidad que la clase va a interactuar con una condicion persistente, cola, texto, base de datos en este caso
	//se aplica la etiqueta entity
}
