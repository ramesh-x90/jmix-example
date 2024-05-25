package com.company.leavetracker.entity;

import io.jmix.core.metamodel.annotation.JmixEntity;
import io.jmix.core.metamodel.annotation.JmixProperty;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.NotNull;

import java.util.Date;

@JmixEntity
public class EmployeeLeaveRequest {
    @JmixProperty(mandatory = true)
    @NotNull
    private String leaveType;

    @Temporal(TemporalType.TIMESTAMP)
    private Date periodFrom;

    @Temporal(TemporalType.TIMESTAMP)
    private Date periodTo;

    public Date getPeriodTo() {
        return periodTo;
    }

    public void setPeriodTo(Date periodTo) {
        this.periodTo = periodTo;
    }

    public Date getPeriodFrom() {
        return periodFrom;
    }

    public void setPeriodFrom(Date periodFrom) {
        this.periodFrom = periodFrom;
    }

    public LeaveTypes getLeaveType() {
        return leaveType == null ? null : LeaveTypes.fromId(leaveType);
    }

    public void setLeaveType(LeaveTypes leaveType) {
        this.leaveType = leaveType == null ? null : leaveType.getId();
    }
}