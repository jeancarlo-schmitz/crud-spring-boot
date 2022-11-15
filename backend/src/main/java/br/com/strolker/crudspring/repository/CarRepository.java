package br.com.strolker.crudspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.strolker.crudspring.domain.car.Car;

public interface CarRepository extends JpaRepository<Car, Long>{

}
