package com.project.springmvc.service;

import com.project.springmvc.model.Beer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Slf4j
@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public Beer findBeerById(UUID id) {

        log.info("Find beer by id: {}", id);

        return Beer.builder()
                .id(id)
                .version(1)
                .beerName("Galaxy Cat")
                .upc("12356")
                .price(new BigDecimal("12.99"))
                .quantityOnHand(122)
                .createdDate(LocalDateTime.now())
                .build();
    }
}
