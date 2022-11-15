package br.com.strolker.crudspring.domain.brand;

import java.time.OffsetDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import br.com.strolker.crudspring.domain.core.DatabaseObject;

@Entity
@Table(name = "brand", schema = "car")
public class Brand extends DatabaseObject{

	@NotNull
	@Column(name = "name")
	private String name;
	
	@Column(name = "head_office")
	private String headOffice;
	
	@Column(name = "brand_ceo")
	private String brandCeo;
	
	@Column(name = "is_active")
	private boolean isActive;
	
	@Column(name = "created_at")
	private OffsetDateTime createdAt;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHeadOffice() {
		return headOffice;
	}

	public void setHeadOffice(String headOffice) {
		this.headOffice = headOffice;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public OffsetDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(OffsetDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public String getBrandCeo() {
		return brandCeo;
	}

	public void setBrandCeo(String brandCeo) {
		this.brandCeo = brandCeo;
	}

	@Override
	public String toString() {
		return "CarBrand [name=" + name + ", headOffice=" + headOffice + ", isActive=" + isActive + ", createdAt="
				+ createdAt + "]";
	}
}
