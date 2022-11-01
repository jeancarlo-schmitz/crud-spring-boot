package br.com.strolker.crudspring.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.strolker.crudspring.domain.Car;
import br.com.strolker.crudspring.repository.CarRepository;
import br.com.strolker.crudspring.service.dto.CarEdition;
import br.com.strolker.crudspring.service.dto.mapper.CarMapper;

@Service
@Transactional
public class CarService {

	@Autowired
	private CarRepository carRepository;
	
	@Autowired
	private CarMapper carMapper;
	
	public Car saveCar(CarEdition carEdition) {
		
		Car car = carMapper.editionToDomain(carEdition);
		
		return carRepository.save(car);
	}
}
