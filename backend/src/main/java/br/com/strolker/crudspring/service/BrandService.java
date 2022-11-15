package br.com.strolker.crudspring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.strolker.crudspring.domain.brand.BrandSummary;
import br.com.strolker.crudspring.repository.BrandSummaryRepository;

@Service
@Transactional
public class BrandService {

	@Autowired
	private BrandSummaryRepository brandSummaryRepository;
	
	@Transactional(readOnly = true)
	public List<BrandSummary> findAllBrand() {
		return brandSummaryRepository.findAll();
	}
}
