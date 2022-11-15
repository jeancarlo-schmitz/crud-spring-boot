package br.com.strolker.crudspring.service.dto.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import br.com.strolker.crudspring.domain.car.Car;
import br.com.strolker.crudspring.service.dto.CarEdition;
import br.com.strolker.crudspring.service.dto.CarUpdate;

@Mapper(componentModel = "spring")
public interface CarMapper {

	Car editionToDomain(CarEdition dto);
	
	@InheritInverseConfiguration
	CarEdition domainToEdition(Car domain);
	
	void update(@MappingTarget Car domain, CarUpdate updateGroup);
}
