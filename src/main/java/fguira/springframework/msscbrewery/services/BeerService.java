package fguira.springframework.msscbrewery.services;

import fguira.springframework.msscbrewery.web.model.BeerDto;
import java.util.UUID;
import org.springframework.stereotype.Service;

/**
 * Created by fguira on 2020-02-02 at 21:42
 */
public interface BeerService {

    BeerDto getBeerById(UUID beerId);
}
