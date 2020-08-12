package spring.micro.services.breweryservice.web.model;

/*
 * Created by Nibir Hossain on 09.08.20
 */

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Null;
import javax.validation.constraints.Size;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CustomerDto {
    @Null
    private UUID id;
    @NotBlank
    @Size(min = 3, max = 100)
    private String firstName;
    @NotBlank
    @Size(min = 3, max = 100)
    private String lastName;
}
