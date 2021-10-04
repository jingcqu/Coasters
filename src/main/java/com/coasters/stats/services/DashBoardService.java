package com.coasters.stats.services;

import com.coasters.stats.api.v1.domain.CourseGroupDTO;
import com.coasters.stats.api.v1.domain.CourseTermDTO;
import reactor.core.publisher.Flux;

import java.util.UUID;

public interface DashBoardService {
    Flux<CourseGroupDTO> getUserCourseGroups(UUID id);
    Flux<CourseTermDTO> getUserCourseTerms(UUID id);
}
