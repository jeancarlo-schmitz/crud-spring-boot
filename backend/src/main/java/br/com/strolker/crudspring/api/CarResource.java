package br.com.strolker.crudspring.api;

import java.net.URI;
import java.net.URISyntaxException;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.strolker.crudspring.domain.Car;
import br.com.strolker.crudspring.service.CarService;
import br.com.strolker.crudspring.service.dto.CarEdition;
import tech.jhipster.web.util.HeaderUtil;

@RestController
@RequestMapping("/api/car")
public class CarResource {

	@Autowired
	private CarService carService;
	
	private static final String ENTITY_NAME = "Car";
	
    @Value("${jhipster.clientApp.name}")
    private String applicationName;
	
	@PostMapping
	public ResponseEntity<Car> createCar(@Valid CarEdition carEdition) throws URISyntaxException{
		
		try {
			Car result = carService.saveCar(carEdition);
			return ResponseEntity.created(new URI("/api/car/" + result.getId()))
					.headers(HeaderUtil.createEntityCreationAlert(applicationName, true, ENTITY_NAME,
							result.getId().toString()))
					.body(result);
		} catch (DataIntegrityViolationException e) {
			System.out.println(e);
//			throw new BadRequestAlertException("Name or code already exists", ENTITY_NAME, e.getMessage());
			return null;
		}
	}
	
	@GetMapping
	public ResponseEntity<?> findAllCars(){
		
		return null;
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> findByIdCar(@PathVariable Long id){
		
		return null;
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> updateCar(@PathVariable Long id){
		
		return null;
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteCar(@PathVariable Long id){
		
		return null;
	}
}
