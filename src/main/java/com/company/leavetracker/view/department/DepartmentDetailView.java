package com.company.leavetracker.view.department;

import com.company.leavetracker.entity.Department;

import com.company.leavetracker.view.main.MainView;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "departments/:id", layout = MainView.class)
@ViewController("Department.detail")
@ViewDescriptor("department-detail-view.xml")
@EditedEntityContainer("departmentDc")
public class DepartmentDetailView extends StandardDetailView<Department> {
}