package br.com.strolker.crudspring.service.dto.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;

import br.com.strolker.crudspring.domain.Car;
import br.com.strolker.crudspring.service.dto.CarEdition;

@Mapper(componentModel = "spring", uses = {})
public interface CarMapper {

	Car editionToDomain(CarEdition dto);
	
	@InheritInverseConfiguration
	CarEdition domainToEdition(Car domain);
}
