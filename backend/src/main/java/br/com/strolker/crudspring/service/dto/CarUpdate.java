package br.com.strolker.crudspring.service.dto;

import java.time.OffsetDateTime;

import javax.persistence.Column;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.UpdateTimestamp;

public class CarUpdate {
    
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
    
    @Column(name = "updated_at", insertable = false)
    @UpdateTimestamp
    private OffsetDateTime updatedAt;

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

	@Override
	public String toString() {
		return "CarUpdate [name=" + name + ", idBrand=" + idBrand + ", idCategoryType=" + idCategoryType
				+ ", yearFabrication=" + yearFabrication + ", chassi=" + chassi + ", updatedAt=" + updatedAt + "]";
	}
}
