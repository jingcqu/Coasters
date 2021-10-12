package com.coasters.stats.api.v1.convertter;

import com.coasters.stats.api.v1.domain.SchoolDTO;
import com.coasters.stats.domain.School;
import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

/**
 * author: jingcqu
 * on: 12/10/2021
 */

@Component
public class SchoolDTOToSchool implements Converter<SchoolDTO, School> {
    @Synchronized
    @Nullable
    @Override
    public School convert(SchoolDTO source) {
        School school = new School();
        school.setDescription(source.getDescription());
        school.setName(source.getName());
        return school;
    }
}
