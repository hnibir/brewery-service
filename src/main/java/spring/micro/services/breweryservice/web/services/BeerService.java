package spring.micro.services.breweryservice.web.services;

import spring.micro.services.breweryservice.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID beerId);
    BeerDto createNewBeer(BeerDto beerDto);
    void updateBeer(UUID beerId, BeerDto beerDto);
    void deleteBeerById(UUID beerId);
}
