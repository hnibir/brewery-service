package spring.micro.services.breweryservice.web.controller;

/*
 * Created by Nibir Hossain on 09.08.20
 */

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.micro.services.breweryservice.web.model.CustomerDto;
import spring.micro.services.breweryservice.web.services.CustomerService;

import java.util.UUID;

@RestController
@RequestMapping(value = "/api/v1/customer")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping(value = {"/{customerId}"})
    public ResponseEntity<CustomerDto> getCustomer(@PathVariable("customerId") UUID custId) {
        return new ResponseEntity<>(customerService.getCustomerById(custId), HttpStatus.OK);
    }
}
