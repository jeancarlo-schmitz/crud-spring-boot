package br.com.strolker.crudspring.domain;

import java.time.OffsetDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import com.vladmihalcea.hibernate.type.basic.PostgreSQLEnumType;

@Entity
@Table(schema = "car", name = "car")
@TypeDef(name = "pgsql_enum", typeClass = PostgreSQLEnumType.class)
public class Car extends DatabaseObject {

	@NotNull
    @Column(name = "name")
	private String name;
	
	@NotNull
    @Column(name = "id_brand")
	private String idBrand;
    
    @NotNull
    @Enumerated(EnumType.STRING)
    @Type(type = "pgsql_enum")
    @Column(name = "category_type")
	private CategoryType categoryType;
	
    @NotNull
    @Column(name = "year_fabrication")
	private int yearFabrication;
	
    @NotNull
    @Column(name = "chassi")
	private String chassi;
	
    @Column(name = "created_at", updatable = false)
    @CreationTimestamp
    private OffsetDateTime createdAt;
    
    @Column(name = "updated_at")
    private OffsetDateTime updatedAt;

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

	public OffsetDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(OffsetDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public OffsetDateTime getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(OffsetDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", idCarBrand=" + idBrand + ", categoryType=" + categoryType
				+ ", yearFabrication=" + yearFabrication + ", chassi=" + chassi + ", createdAt=" + createdAt
				+ ", updatedAt=" + updatedAt + "]";
	}
}
