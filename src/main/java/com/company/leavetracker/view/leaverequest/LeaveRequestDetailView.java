package com.company.leavetracker.view.leaverequest;

import com.company.leavetracker.entity.LeaveRequest;

import com.company.leavetracker.view.main.MainView;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "leaveRequests/:id", layout = MainView.class)
@ViewController("LeaveRequest.detail")
@ViewDescriptor("leave-request-detail-view.xml")
@EditedEntityContainer("leaveRequestDc")
public class LeaveRequestDetailView extends StandardDetailView<LeaveRequest> {
}