package com.project.demo.repository;

import com.project.demo.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Integer> {
}
