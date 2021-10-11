package com.coasters.stats.repository;

import com.coasters.stats.domain.User;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Mono;

import java.nio.channels.FileChannel;
import java.util.UUID;

/**
 * author: jingcqu
 * on: 24/09/2021
 */
public interface UserRepository extends ReactiveMongoRepository<User, String> {
    Mono<User> findById(UUID id);
}
