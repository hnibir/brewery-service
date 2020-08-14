package spring.micro.services.breweryservice.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import spring.micro.services.breweryservice.web.model.v2.BeerStyleEnum;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Null;
import javax.validation.constraints.Positive;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Beer {

    @Null
    private UUID id;
    @NotBlank
    private String name;
    private BeerStyleEnum beerStyle;
    @Positive
    private Long upc;
}
