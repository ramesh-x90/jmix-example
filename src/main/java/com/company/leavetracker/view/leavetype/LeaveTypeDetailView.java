package com.company.leavetracker.view.leavetype;

import com.company.leavetracker.entity.LeaveType;

import com.company.leavetracker.view.main.MainView;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "leaveTypes/:id", layout = MainView.class)
@ViewController("LeaveType.detail")
@ViewDescriptor("leave-type-detail-view.xml")
@EditedEntityContainer("leaveTypeDc")
public class LeaveTypeDetailView extends StandardDetailView<LeaveType> {
}