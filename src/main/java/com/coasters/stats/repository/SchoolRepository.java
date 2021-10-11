package com.coasters.stats.repository;

import com.coasters.stats.domain.School;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Mono;

import java.util.Optional;

/**
 * author: jingcqu
 * on: 24/09/2021
 */
public interface SchoolRepository extends ReactiveMongoRepository<School, String> {
    Mono<School> findByName(String name);
}
