package com.company.leavetracker.entity;

import io.jmix.core.metamodel.annotation.Composition;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.validation.constraints.*;

import java.math.BigInteger;

@JmixEntity
public class LeaveBalance {
    @NotNull
    @Composition
    private Employees employee;

    @NotBlank(message = "leave typye can't be blank'")
    @NotEmpty(message = "leave type can't be empty")
    @NotNull(message = "leave type can't be null")
    private String leaveType;

    @PositiveOrZero
    @Positive
    @DecimalMin("0")
    @NotNull
    private BigInteger balance;

    public BigInteger getBalance() {
        return balance;
    }

    public void setBalance(BigInteger balance) {
        this.balance = balance;
    }

    public String getLeaveType() {
        return leaveType;
    }

    public void setLeaveType(String leaveType) {
        this.leaveType = leaveType;
    }

    public Employees getEmployee() {
        return employee;
    }

    public void setEmployee(Employees employee) {
        this.employee = employee;
    }
}