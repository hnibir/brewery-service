package spring.micro.services.breweryservice.services.v2;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import spring.micro.services.breweryservice.web.model.BeerDto;
import spring.micro.services.breweryservice.web.model.v2.BeerDtoV2;
import spring.micro.services.breweryservice.web.model.v2.BeerStyleEnum;

import java.util.UUID;

@Slf4j
@Service
public class BeerServiceImplV2 implements BeerServiceV2 {
    @Override
    public BeerDtoV2 getBeerById(UUID beerId) {
        return BeerDtoV2.builder()
                .id(UUID.randomUUID())
                .name("Radler")
                .beerStyle(BeerStyleEnum.PILSNER)
                .upc(12345L)
                .build();
    }

    @Override
    public BeerDtoV2 createNewBeer(BeerDtoV2 beerDto) {
        return BeerDtoV2.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDtoV2 beerDto) {
        // TODO implementation - would add a real implementation to update beer
    }

    @Override
    public void deleteBeerById(UUID beerId) {
        log.info("Deleting a beer...");
    }
}
