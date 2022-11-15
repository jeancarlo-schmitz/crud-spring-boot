package br.com.strolker.crudspring.api;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.com.strolker.crudspring.domain.Car;
import br.com.strolker.crudspring.domain.CarDetail;
import br.com.strolker.crudspring.domain.CarSummary;
import br.com.strolker.crudspring.exception.constants.CarExceptionConstants;
import br.com.strolker.crudspring.service.CarService;
import br.com.strolker.crudspring.service.dto.CarEdition;
import br.com.strolker.crudspring.service.dto.CarUpdate;
import tech.jhipster.web.util.HeaderUtil;
import tech.jhipster.web.util.PaginationUtil;

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
		
		Car result = carService.create(carEdition);
		
		return ResponseEntity.created(new URI("/api/car/" + result.getId()))
				.headers(HeaderUtil.createEntityCreationAlert(applicationName, true, ENTITY_NAME,
						result.getId().toString()))
				.body(result);
	}
	
	@GetMapping
	public ResponseEntity<List<CarSummary>> findAllCars(Pageable pageable){
		Page<CarSummary> page = carService.findAll(pageable);
		
		HttpHeaders headers = PaginationUtil
                .generatePaginationHttpHeaders(ServletUriComponentsBuilder.fromCurrentRequest(), page);
		
        return ResponseEntity.ok().headers(headers).body(page.getContent());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<CarDetail> findByIdCar(@PathVariable Long id){
		
		CarDetail carDetail = carService.findById(id);
		
		return ResponseEntity.ok(carDetail);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<CarDetail> updateCar(@RequestBody @Valid CarUpdate carUpdate, @PathVariable Long id){
		CarDetail carUpdated = carService.update(carUpdate, id);
		
		return ResponseEntity.ok().headers(HeaderUtil.createEntityUpdateAlert(applicationName, true, CarExceptionConstants.ENTITY_NAME,
				id.toString())).body(carUpdated);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteCar(@PathVariable Long id){
		carService.deleteById(id);
		
        return ResponseEntity.noContent()
                .headers(HeaderUtil.createEntityDeletionAlert(applicationName, true, CarExceptionConstants.ENTITY_NAME, id.toString()))
                .build();
	}
}
