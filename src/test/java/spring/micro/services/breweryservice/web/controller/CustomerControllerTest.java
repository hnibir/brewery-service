package spring.micro.services.breweryservice.web.controller;

/*
 * Created by Nibir Hossain on 09.08.20
 */

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import spring.micro.services.breweryservice.web.model.CustomerDto;
import spring.micro.services.breweryservice.services.CustomerService;

import java.util.UUID;

import static org.hamcrest.core.Is.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@WebMvcTest(CustomerController.class)
public class CustomerControllerTest {

    @MockBean
    CustomerService customerService;
    @Autowired
    MockMvc mockMvc;
    @Autowired
    ObjectMapper objectMapper;
    CustomerDto validCustomer;

    @Before
    public void setup() {
        validCustomer = CustomerDto.builder()
                .id(UUID.randomUUID())
                .firstName("Nibir")
                .lastName("Hossain")
                .build();
    }

    @Test
    public void getCustomer() throws Exception {
       given(customerService.getCustomerById(any(UUID.class))).willReturn(validCustomer);

       mockMvc.perform(get("/api/v1/customer/" + validCustomer.getId().toString())
                .accept(MediaType.APPLICATION_JSON))
               .andExpect(status().isOk())
               .andExpect(content().contentType(MediaType.APPLICATION_JSON))
               .andExpect(jsonPath("$.firstName", is(validCustomer.getFirstName())))
               .andExpect(jsonPath("$.lastName", is(validCustomer.getLastName())));
    }

    @Test
    public void handlePost() throws Exception {
        // given
        CustomerDto customerDto = validCustomer;
        customerDto.setId(null);

        CustomerDto savedCustomerDto = CustomerDto.builder()
                .id(UUID.randomUUID())
                .firstName("Nibir")
                .lastName("Hossain")
                .build();
        String customerDtoJson = objectMapper.writeValueAsString(customerDto);

        given(customerService.createNewCustomer(any())).willReturn(savedCustomerDto);

        mockMvc.perform(post("/api/v1/customer/")
                .contentType(MediaType.APPLICATION_JSON)
                .content(customerDtoJson))
                .andExpect(status().isCreated());
    }

    @Test
    public void handleUpdate() throws Exception {
        // given
        CustomerDto customerDto = validCustomer;
        customerDto.setId(null);
        String customerDtoJson = objectMapper.writeValueAsString(customerDto);

        // when
        mockMvc.perform(put("/api/v1/customer/" + UUID.randomUUID())
                .contentType(MediaType.APPLICATION_JSON)
                .content(customerDtoJson))
                .andExpect(status().isNoContent());

        then(customerService).should().updateCustomer(any(), any());
    }
}
