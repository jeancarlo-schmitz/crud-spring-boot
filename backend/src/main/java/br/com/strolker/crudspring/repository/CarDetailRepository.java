package br.com.strolker.crudspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.strolker.crudspring.domain.CarDetail;

public interface CarDetailRepository extends JpaRepository<CarDetail, Long> {

}
