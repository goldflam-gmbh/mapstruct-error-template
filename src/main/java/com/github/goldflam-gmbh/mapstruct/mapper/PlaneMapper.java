package org.example.mapstruct.mapper;

import org.example.mapstruct.dto.PlaneDto;
import org.example.mapstruct.model.Plane;
import org.mapstruct.MapperConfig;
import org.mapstruct.*;


@Mapper(componentModel = "spring", uses = {MapperConfig.class}, injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public abstract class PlaneMapper {

    public abstract PlaneDto planeToPlaneDto(Plane plane);

    public abstract Plane planeDtoToPlane(PlaneDto planeDto);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    @Mapping(target = "id", ignore = true)
    public abstract Plane updatePlaneWithPlaneDto(PlaneDto update, @MappingTarget Plane destination);

}
