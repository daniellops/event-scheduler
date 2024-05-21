package com.eventscheduler.infrastructure.persistence.converter;

import com.eventscheduler.domain.enums.DayOfWeek;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class DayOfWeekConverter implements AttributeConverter<DayOfWeek, Integer> {
    @Override
    public Integer convertToDatabaseColumn(DayOfWeek dayOfWeek) {
        if (dayOfWeek == null) {
            return null;
        }
        return dayOfWeek.getDayCode();
    }

    @Override
    public DayOfWeek convertToEntityAttribute(Integer dayCode) {
        if (dayCode == null) {
            return null;
        }
        for (DayOfWeek day : DayOfWeek.values()) {
            if (day.getDayCode() == dayCode) {
                return day;
            }
        }
        throw new IllegalArgumentException("Unknown dayCode: " + dayCode);
    }
}
