package com.company.leavetracker.view.leaverequest;

import com.company.leavetracker.entity.LeaveRequest;

import com.company.leavetracker.view.main.MainView;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "leaveRequests", layout = MainView.class)
@ViewController("LeaveRequest.list")
@ViewDescriptor("leave-request-list-view.xml")
@LookupComponent("leaveRequestsDataGrid")
@DialogMode(width = "64em")
public class LeaveRequestListView extends StandardListView<LeaveRequest> {
}