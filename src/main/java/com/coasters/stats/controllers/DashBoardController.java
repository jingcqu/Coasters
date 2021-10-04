package com.coasters.stats.controllers;

import com.coasters.stats.api.v1.domain.CourseGroupDTO;
import com.coasters.stats.api.v1.domain.CourseTermDTO;
import com.coasters.stats.services.DashBoardService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.util.UUID;

@RestController
@RequestMapping("/dashboard")
public class DashBoardController {
    private DashBoardService dashBoardService;

    @GetMapping("/courseList/{userId}")
    public Flux<CourseGroupDTO> getUserCourseGroups(@PathVariable("userId") UUID userId){ //todo: write tests before further implementation
        return dashBoardService.getUserCourseGroups(userId);
    }

    @GetMapping("/courseList/term/{userId}")
    public Flux<CourseTermDTO> getUserCourseTerms(@PathVariable("userId") UUID userId){ //todo: write tests before further implementation
        return dashBoardService.getUserCourseTerms(userId);
    }
}
