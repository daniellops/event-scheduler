package com.eventscheduler.domain.enums;

public enum DayOfWeek {
    SUNDAY(1),
    MONDAY(2),
    TUESDAY(3),
    WEDNESDAY(4),
    THURSDAY(5),
    FRIDAY(6),
    SATURDAY(7);

    private final int dayCode;

    DayOfWeek(int dayCode) {
        this.dayCode = dayCode;
    }

    public int getDayCode() {
        return dayCode;
    }
}
