package br.com.strolker.crudspring.domain.car;

import java.time.OffsetDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.web.bind.annotation.CrossOrigin;

import br.com.strolker.crudspring.domain.core.DatabaseObject;

@CrossOrigin(maxAge = 3600)
@Entity
@Table(schema = "car", name = "car")
public class Car extends DatabaseObject {

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
	
    @Column(name = "created_at", updatable = false)
    @CreationTimestamp
    private OffsetDateTime createdAt;
    
    @Column(name = "updated_at", insertable = false)
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

	public OffsetDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(OffsetDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public OffsetDateTime getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt() {
		this.updatedAt = OffsetDateTime.now();
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", idCarBrand=" + idBrand + ", idCategoryType=" + idCategoryType
				+ ", yearFabrication=" + yearFabrication + ", chassi=" + chassi + ", createdAt=" + createdAt
				+ ", updatedAt=" + updatedAt + "]";
	}
}
