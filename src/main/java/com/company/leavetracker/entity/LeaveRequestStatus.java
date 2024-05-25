package com.company.leavetracker.entity;

import io.jmix.core.metamodel.datatype.EnumClass;

import org.springframework.lang.Nullable;


public enum LeaveRequestStatus implements EnumClass<Integer> {

    PENDING(1),
    APPROVED(2),
    REJECTED(3),
    EXPIRED(5),
    CANCELLED(6),
    INPROGRESS(7),
    COMPLETED(8);

    private final Integer id;

    LeaveRequestStatus(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    @Nullable
    public static LeaveRequestStatus fromId(Integer id) {
        for (LeaveRequestStatus at : LeaveRequestStatus.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}