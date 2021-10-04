package com.coasters.stats.services;

import com.coasters.stats.api.v1.domain.CourseInstanceDTO;
import reactor.core.publisher.Mono;

import java.util.UUID;

/**
 * author: jingcqu
 * on: 24/09/2021
 */
public interface CourseInstanceService {
    Mono<CourseInstanceDTO> calculateFutureGradeRange(CourseInstanceDTO courseInstanceDTO);
    Mono<CourseInstanceDTO> getCourseInstanceDTOById(UUID id);
}
