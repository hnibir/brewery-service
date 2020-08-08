package spring.micro.services.breweryservice.web.services;

import org.springframework.stereotype.Service;
import spring.micro.services.breweryservice.web.model.BeerDto;

import java.util.UUID;

@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .name("Radler")
                .style("German Brand")
                .build();
    }

    @Override
    public BeerDto createNewBeer(BeerDto beerDto) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .build();
    }
}
