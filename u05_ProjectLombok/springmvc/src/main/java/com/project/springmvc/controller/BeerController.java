package com.project.springmvc.controller;

import com.project.springmvc.model.Beer;
import com.project.springmvc.service.BeerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;

import java.util.UUID;

@Slf4j
@Controller
@RequiredArgsConstructor
public class BeerController {

    private final BeerService beerService;

    public Beer getBeerById(UUID id) {
        log.info("Get Beer by id: {} - In Controller", id);
        return beerService.findBeerById(id);
    }

}
