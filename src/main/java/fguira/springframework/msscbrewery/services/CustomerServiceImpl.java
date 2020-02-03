package fguira.springframework.msscbrewery.services;

import fguira.springframework.msscbrewery.web.model.CustomerDto;
import java.util.UUID;
import org.springframework.stereotype.Service;

/**
 * Created by fguira on 2020-02-02 at 22:58
 */
@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto.builder().id(UUID.randomUUID())
                .name("Chico")
                .build();
    }
}
