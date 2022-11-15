package br.com.strolker.crudspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.strolker.crudspring.domain.brand.BrandSummary;

public interface BrandSummaryRepository extends JpaRepository<BrandSummary, Long> {

}
