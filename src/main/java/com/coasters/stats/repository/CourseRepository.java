package com.coasters.stats.repository;

import com.coasters.stats.domain.Course;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

/**
 * author: jingcqu
 * on: 24/09/2021
 */
public interface CourseRepository extends ReactiveMongoRepository<Course, String> {
}
