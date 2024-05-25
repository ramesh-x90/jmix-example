package com.company.leavetracker.entity;

import io.jmix.core.metamodel.datatype.EnumClass;

import org.springframework.lang.Nullable;


public enum DepartmentsTypes implements EnumClass<Integer> {

    IT(1),
    ENGINEERING(2),
    FINANCE(3);

    private final Integer id;

    DepartmentsTypes(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    @Nullable
    public static DepartmentsTypes fromId(Integer id) {
        for (DepartmentsTypes at : DepartmentsTypes.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}