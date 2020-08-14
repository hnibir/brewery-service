package spring.micro.services.breweryservice.web.mappers;

import org.mapstruct.Mapper;
import spring.micro.services.breweryservice.domain.Customer;
import spring.micro.services.breweryservice.web.model.CustomerDto;

/*
 * Created by Nibir Hossain on 14.08.20
 */

@Mapper
public interface CustomerMapper {
    CustomerDto customerToCustomerDto(Customer customer);
    Customer customerDtoToCustomer(CustomerDto customerDto);
}
