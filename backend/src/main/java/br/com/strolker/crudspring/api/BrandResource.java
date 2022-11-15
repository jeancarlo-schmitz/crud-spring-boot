package br.com.strolker.crudspring.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.strolker.crudspring.domain.brand.BrandSummary;
import br.com.strolker.crudspring.service.BrandService;

@RestController
@RequestMapping("/api/brand")
public class BrandResource {
	
    @Value("${jhipster.clientApp.name}")
    private String applicationName;

    @Autowired
	private BrandService brandService;
	
	@GetMapping
	public ResponseEntity<List<BrandSummary>> getAllBrand() {
		List<BrandSummary> brandList = brandService.findAllBrand();
		
		return ResponseEntity.ok().body(brandList);
	}
}
