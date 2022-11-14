package br.com.strolker.crudspring.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(schema = "car", name = "car_update")
public class CarUpdate {
	
    @NotNull
    private Long id;
    
	@NotNull
    @Column(name = "name")
	private String name;
	
	@NotNull
    @Column(name = "id_brand")
	private Long idBrand;
    
    @NotNull
    @Column(name = "id_category_type")
	private Long idCategoryType;
	
    @NotNull
    @Column(name = "year_fabrication")
	private int yearFabrication;
	
    @NotNull
    @Column(name = "chassi")
	private String chassi;

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
