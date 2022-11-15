package br.com.strolker.crudspring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.strolker.crudspring.domain.Car;
import br.com.strolker.crudspring.domain.CarDetail;
import br.com.strolker.crudspring.domain.CarSummary;
import br.com.strolker.crudspring.repository.CarDetailRepository;
import br.com.strolker.crudspring.repository.CarRepository;
import br.com.strolker.crudspring.repository.CarSummaryRepository;
import br.com.strolker.crudspring.service.dto.CarEdition;
import br.com.strolker.crudspring.service.dto.CarUpdate;
import br.com.strolker.crudspring.service.dto.mapper.CarMapper;

@Service
@Transactional
public class CarService {

	@Autowired
	private CarRepository carRepository;
	
	@Autowired
	private CarSummaryRepository carSummaryRepository;
	
	@Autowired
	private CarDetailRepository carDetailRepository;
	
	@Autowired
	private CarMapper carMapper;
	
	public Car create(CarEdition carEdition) {
		
		Car car = carMapper.editionToDomain(carEdition);
		
		return carRepository.save(car);
	}
	
	public CarDetail update(CarUpdate carUpdate, Long id) {
		validateFieldsBeforeUpdateCar(carUpdate);
		
		Car carFound = carRepository.findById(id).orElseThrow(/*Todo excepetion not found*/);
		
		carMapper.update(carFound, carUpdate);
		
		setUpdatedAt(carFound);
		
		
		carRepository.saveAndFlush(carFound);
		
		return this.findById(id);
	}

	private void setUpdatedAt(Car carFound) {
		carFound.setUpdatedAt();
		
	}

	private void validateFieldsBeforeUpdateCar(CarUpdate carUpdate) {
		// TODO Auto-generated method stub
		
		
	}

	@Transactional(readOnly = true)
	public Page<CarSummary> findAll(Pageable pageable) {
		return carSummaryRepository.findAll(pageable);
	}
	
	@Transactional(readOnly = true)
	public CarDetail findById(Long id) {
		return carDetailRepository.findById(id).orElseThrow(/*Todo excepetion not found*/);
	}
	
	public void deleteById(Long idCar) {
		this.findById(idCar);
		
		carRepository.deleteById(idCar);
	}
}
