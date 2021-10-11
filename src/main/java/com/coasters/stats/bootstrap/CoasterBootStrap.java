package com.coasters.stats.bootstrap;

import com.coasters.stats.domain.*;
import com.coasters.stats.repository.SchoolRepository;
import com.coasters.stats.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import static com.coasters.stats.domain.GradClass.YEAR_2;

/**
 * author: jingcqu
 * on: 10/10/2021
 */

@Slf4j
@Component
public class CoasterBootStrap implements ApplicationListener<ContextRefreshedEvent> {
    private final UserRepository userRepository;
    private final SchoolRepository schoolRepository;

    public CoasterBootStrap(UserRepository userRepository, SchoolRepository schoolRepository) {
        this.userRepository = userRepository;
        this.schoolRepository = schoolRepository;
    }


    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        loadSchools();
        loadUsers();
    }

    private void loadSchools(){
        School school1 = new School("SwampU", "Top: Medieval Literature Studies");
        School school2 = new School("AvengerU", "STEM and Strategic Defence studies");
        School school3 = new School("MeanGirlsU", "Social Studies");
        schoolRepository.save(school1);
        schoolRepository.save(school2);
        schoolRepository.save(school3);
    }

    private void loadUsers(){
        User user1 = new User("Shrek", "Green", UndergradClass.SENIOR, StudentLevel.UNDERGRADUATE);
        user1.setSchool(schoolRepository.findByName("SwampU").block());

        User user2 = new User("Peter", "Parker", UndergradClass.FRESHMAN, StudentLevel.UNDERGRADUATE);
        user2.setSchool(schoolRepository.findByName("AvengerU").block());

        User user3 = new User("Steven", "Strange", GradClass.YEAR_3, StudentLevel.GRADUATE);
        user3.setSchool(schoolRepository.findByName("AvengerU").block());

        User user4 = new User("Regina", "George", UndergradClass.SOPHOMORE, StudentLevel.UNDERGRADUATE);
        user4.setSchool(schoolRepository.findByName("MeanGirlsU").block());
    }

}
