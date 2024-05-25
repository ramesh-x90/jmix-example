package com.company.leavetracker.entity;

import io.jmix.core.metamodel.datatype.EnumClass;

import org.springframework.lang.Nullable;


public enum LeaveTypes implements EnumClass<String> {

    ANNUAL_LEAVE("1"),
    SICK_LEAVE("2"),
    PERSONAL_LEAVE("3"),
    PUBLIC_LEAVE("4"),
    EMERGENCY_LEAVE("5");

    private final String id;

    LeaveTypes(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static LeaveTypes fromId(String id) {
        for (LeaveTypes at : LeaveTypes.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}