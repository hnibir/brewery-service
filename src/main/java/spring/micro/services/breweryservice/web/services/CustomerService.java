package spring.micro.services.breweryservice.web.services;

import spring.micro.services.breweryservice.web.model.CustomerDto;

import java.util.UUID;

/*
 * Created by Nibir Hossain on 09.08.20
 */
public interface CustomerService {

    CustomerDto getCustomerById(UUID custId);
}
