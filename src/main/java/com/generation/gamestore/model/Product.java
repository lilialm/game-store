package com.generation.gamestore.model;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_products")
public class Product {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@NotBlank(message= "O atributo name é obrigatório!") 
	@Size(min = 5, max = 255, message = "O atributo name deve ter no mínimo 5 e no máximo 255 caracteres")
	private String name;
	
	@NotBlank (message= "O atributo description é obrigatório!")
	@Size(min = 8, max = 255, message = "O atributo description deve ter no mínimo 8 e no máximo 500 caracteres")
	private String description;
	
	@NotNull (message= "O atributo price é obrigatório!")
	@Positive (message= "O valor deve ser positivo")
	private BigDecimal price;
	
	@ManyToOne
	@JsonIgnoreProperties("product")
	private Category category;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
	
	
	
	

}
