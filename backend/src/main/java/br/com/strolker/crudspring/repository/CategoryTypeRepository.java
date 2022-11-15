package br.com.strolker.crudspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.strolker.crudspring.domain.category.type.CategoryTypeSummary;

public interface CategoryTypeRepository extends JpaRepository<CategoryTypeSummary, Long> {

}
