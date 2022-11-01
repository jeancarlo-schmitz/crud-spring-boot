package br.com.strolker.crudspring.service.dto;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Type;

import br.com.strolker.crudspring.domain.CategoryType;

public class CarEdition {

	@NotBlank
	private String name;
	
	@NotBlank
	private String idBrand;
	
    @NotNull
    @Enumerated(EnumType.STRING)
    @Type(type = "pgsql_enum")
    @Column(name = "category_type")
	private CategoryType categoryType;
    
	@NotBlank
    private int yearFabrication;
    
	@NotBlank
    private String chassi;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIdBrand() {
		return idBrand;
	}

	public void setIdBrand(String idBrand) {
		this.idBrand = idBrand;
	}

	public CategoryType getCategoryType() {
		return categoryType;
	}

	public void setCategoryType(CategoryType categoryType) {
		this.categoryType = categoryType;
	}

	public int getYearFabrication() {
		return yearFabrication;
	}

	public void setYearFabrication(int yearFabrication) {
		this.yearFabrication = yearFabrication;
	}

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}
}
