package spring.micro.services.breweryservice.web.mappers;

import org.mapstruct.Mapper;
import spring.micro.services.breweryservice.domain.Beer;
import spring.micro.services.breweryservice.web.model.BeerDto;

/*
 * Created by Nibir Hossain on 14.08.20
 */

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {
    BeerDto beerToBeerDto(Beer beer);
    Beer beerDtoToBeer(BeerDto beerDto);
}
