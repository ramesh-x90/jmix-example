package com.company.leavetracker.view.employees;

import com.company.leavetracker.entity.Employees;

import com.company.leavetracker.view.main.MainView;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "employeeses/:id", layout = MainView.class)
@ViewController("Employees.detail")
@ViewDescriptor("employees-detail-view.xml")
@EditedEntityContainer("employeesDc")
public class EmployeesDetailView extends StandardDetailView<Employees> {
}