package com.coasters.stats.repository;

import com.coasters.stats.domain.Department;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

/**
 * author: jingcqu
 * on: 24/09/2021
 */
public interface DepartmentRepository extends ReactiveMongoRepository<Department, String> {
}
