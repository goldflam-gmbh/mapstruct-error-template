package org.example.mapstruct.mapper;

import org.example.mapstruct.dto.ShipDto;
import org.example.mapstruct.model.Ship;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring", uses = {MapperConfig.class}, injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public abstract class ShipMapper {

    public abstract ShipDto shipToShipDto(Ship ship);

    public abstract Ship shipDtoToShip(ShipDto shipDto);

}
