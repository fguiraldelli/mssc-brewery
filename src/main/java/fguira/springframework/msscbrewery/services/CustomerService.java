package fguira.springframework.msscbrewery.services;

import fguira.springframework.msscbrewery.web.model.CustomerDto;
import java.util.UUID;

/**
 * Created by fguira on 2020-02-02 at 22:57
 */
public interface CustomerService {
    CustomerDto getCustomerById(UUID customerId);
}
