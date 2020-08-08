package spring.micro.services.breweryservice.web.model;

/*
 * Created by Nibir Hossain on 09.08.20
 */

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CustomerDto {
    private UUID id;
    private String firstName;
    private String lastName;
}
