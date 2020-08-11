package spring.micro.services.breweryservice.services.v2;

import spring.micro.services.breweryservice.web.model.v2.BeerDtoV2;

import java.util.UUID;

public interface BeerServiceV2 {
    BeerDtoV2 getBeerById(UUID beerId);
    BeerDtoV2 createNewBeer(BeerDtoV2 beerDto);
    void updateBeer(UUID beerId, BeerDtoV2 beerDto);
    void deleteBeerById(UUID beerId);
}
