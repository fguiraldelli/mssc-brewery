package fguira.springframework.msscbrewery.services;

import fguira.springframework.msscbrewery.web.model.BeerDto;
import java.util.UUID;
import org.springframework.stereotype.Service;

/**
 * Created by fguira on 2020-02-02 at 21:47
 */
@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder().id(UUID.randomUUID())
                .beerName("Galaxy Cat")
                .beerStyle("Pale Ale")
                .build();
    }
}
