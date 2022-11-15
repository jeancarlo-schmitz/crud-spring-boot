package br.com.strolker.crudspring.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import br.com.strolker.crudspring.domain.car.CarSummary;

public interface CarSummaryRepository extends PagingAndSortingRepository<CarSummary, Long> {

}
