package spring.micro.services.breweryservice.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import spring.micro.services.breweryservice.web.model.CustomerDto;

import java.util.UUID;

/*
 * Created by Nibir Hossain on 09.08.20
 */

@Service
@Slf4j
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerById(UUID custId) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .firstName("Nibir")
                .lastName("Hossain")
                .build();
    }

    @Override
    public CustomerDto createNewCustomer(CustomerDto customerDto) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .firstName("Sajib")
                .lastName(("Mohammad"))
                .build();
    }

    @Override
    public void updateCustomer(UUID custId, CustomerDto customerDto) {
        // TODO implementation - would add a real implementation to update customer
    }

    @Override
    public void deleteCustomerById(UUID customerId) {
        log.info("Deleting a customer...");
    }
}
