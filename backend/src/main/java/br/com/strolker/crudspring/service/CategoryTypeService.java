package br.com.strolker.crudspring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.strolker.crudspring.domain.category.type.CategoryTypeSummary;
import br.com.strolker.crudspring.repository.CategoryTypeRepository;

@Service
@Transactional
public class CategoryTypeService {

	@Autowired
	private CategoryTypeRepository categoryTypeRepository;
	
	public List<CategoryTypeSummary> findAll(){
		return categoryTypeRepository.findAll();
	}
}
