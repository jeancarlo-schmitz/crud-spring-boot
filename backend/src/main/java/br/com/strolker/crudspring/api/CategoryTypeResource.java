package br.com.strolker.crudspring.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.strolker.crudspring.domain.category.type.CategoryTypeSummary;
import br.com.strolker.crudspring.service.CategoryTypeService;

@RestController
@RequestMapping("/api/category-type")
public class CategoryTypeResource {

	@Autowired
	private CategoryTypeService categoryTypeService;
	
	@GetMapping
	public ResponseEntity<List<CategoryTypeSummary>> findAllCategoryType() {
		List<CategoryTypeSummary> categoryTypeSummaryList = categoryTypeService.findAll();
		
		return ResponseEntity.ok().body(categoryTypeSummaryList);
	}
}
