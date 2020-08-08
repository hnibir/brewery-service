package spring.micro.services.breweryservice.web.services;

import spring.micro.services.breweryservice.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID beerId);
}
