package spring.micro.services.breweryservice.web.services;

import org.springframework.stereotype.Service;
import spring.micro.services.breweryservice.web.model.CustomerDto;

import java.util.UUID;

/*
 * Created by Nibir Hossain on 09.08.20
 */

@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerById(UUID custId) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .firstName("Nibir")
                .lastName("Hossain")
                .build();
    }
}
