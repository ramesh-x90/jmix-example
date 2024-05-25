package com.company.leavetracker.view.employees;

import com.company.leavetracker.entity.Employees;

import com.company.leavetracker.view.main.MainView;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "employeeses", layout = MainView.class)
@ViewController("Employees.list")
@ViewDescriptor("employees-list-view.xml")
@LookupComponent("employeesesDataGrid")
@DialogMode(width = "64em")
public class EmployeesListView extends StandardListView<Employees> {
}