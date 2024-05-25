package com.company.leavetracker.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.UUID;

@JmixEntity
@Table(name = "LEAVE_TYPE")
@Entity
public class LeaveType {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @Column(name = "LEAVE_TYPE_NAME")
    private String leaveTypeName;

    public LeaveTypes getLeaveTypeName() {
        return leaveTypeName == null ? null : LeaveTypes.fromId(leaveTypeName);
    }

    public void setLeaveTypeName(LeaveTypes leaveTypeName) {
        this.leaveTypeName = leaveTypeName == null ? null : leaveTypeName.getId();
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}