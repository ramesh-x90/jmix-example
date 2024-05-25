package com.company.leavetracker.view.employeeleaverequest;

import com.company.leavetracker.entity.EmployeeLeaveRequest;
import com.company.leavetracker.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.core.LoadContext;
import io.jmix.flowui.view.*;

import java.util.Collection;
import java.util.List;

@Route(value = "employeeLeaveRequests", layout = MainView.class)
@ViewController("EmployeeLeaveRequest.list")
@ViewDescriptor("employee-leave-request-list-view.xml")
@LookupComponent("employeeLeaveRequestsDataGrid")
@DialogMode(width = "50em")
public class EmployeeLeaveRequestListView extends StandardListView<EmployeeLeaveRequest> {

    @Install(to = "employeeLeaveRequestsDl", target = Target.DATA_LOADER)
    protected List<EmployeeLeaveRequest> employeeLeaveRequestsDlLoadDelegate(LoadContext<EmployeeLeaveRequest> loadContext) {
        // Here you can load entities from an external storage.
        // Set the loaded entities to the not-new state using EntityStates.setNew(entity, false).
        return List.of();
    }

    @Install(to = "employeeLeaveRequestsDataGrid.remove", subject = "delegate")
    private void employeeLeaveRequestsDataGridRemoveDelegate(final Collection<EmployeeLeaveRequest> collection) {
        for (EmployeeLeaveRequest entity : collection) {
            // Here you can remove entities from an external storage
        }
    }
}
