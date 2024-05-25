package com.company.leavetracker.view.leavetype;

import com.company.leavetracker.entity.LeaveType;

import com.company.leavetracker.view.main.MainView;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "leaveTypes", layout = MainView.class)
@ViewController("LeaveType.list")
@ViewDescriptor("leave-type-list-view.xml")
@LookupComponent("leaveTypesDataGrid")
@DialogMode(width = "64em")
public class LeaveTypeListView extends StandardListView<LeaveType> {
}