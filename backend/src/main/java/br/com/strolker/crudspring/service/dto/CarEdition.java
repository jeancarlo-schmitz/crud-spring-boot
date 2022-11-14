package br.com.strolker.crudspring.service.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class CarEdition {

	@NotBlank
	private String name;
	
	@NotNull
	private Long idBrand;
	
    @NotNull
	private Long idCategoryType;
    
    @NotNull
    private int yearFabrication;
    
	@NotBlank
    private String chassi;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getIdBrand() {
		return idBrand;
	}

	public void setIdBrand(Long idBrand) {
		this.idBrand = idBrand;
	}

	public Long getIdCategoryType() {
		return idCategoryType;
	}

	public void setIdCategoryType(Long idCategoryType) {
		this.idCategoryType = idCategoryType;
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
