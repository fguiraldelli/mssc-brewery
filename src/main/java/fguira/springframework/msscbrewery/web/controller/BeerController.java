package fguira.springframework.msscbrewery.web.controller;

import fguira.springframework.msscbrewery.services.BeerService;
import fguira.springframework.msscbrewery.web.model.BeerDto;
import java.util.UUID;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by fguira on 2020-02-02 at 21:30
 */
@RequestMapping("/api/v1/beer")
@RestController
public class BeerController {

    private final BeerService beerService;

    public BeerController(BeerService beerService) {
        this.beerService = beerService;
    }

    @GetMapping({"/{beerId}"})
    public ResponseEntity<BeerDto> getBeer(@PathVariable("beerId") UUID beerId){
       return new ResponseEntity<>(beerService.getBeerById(beerId), HttpStatus.OK);
    }
}