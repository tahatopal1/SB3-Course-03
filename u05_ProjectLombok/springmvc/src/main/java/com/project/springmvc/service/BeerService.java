package com.project.springmvc.service;

import com.project.springmvc.model.Beer;

import java.util.UUID;

public interface BeerService {
    Beer findBeerById(UUID id);
}
