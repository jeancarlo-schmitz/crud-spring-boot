package br.com.strolker.crudspring.domain.category.type;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import br.com.strolker.crudspring.domain.core.DatabaseObject;

@Entity
@Table(schema = "car", name = "category_type")
public class CategoryType extends DatabaseObject {

	@NotNull
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
