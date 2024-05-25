package com.company.leavetracker.view.employeeleaverequest;

import com.company.leavetracker.entity.EmployeeLeaveRequest;
import com.company.leavetracker.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.core.LoadContext;
import io.jmix.core.SaveContext;
import io.jmix.flowui.view.*;

import java.util.Set;

@Route(value = "employeeLeaveRequests/:id", layout = MainView.class)
@ViewController("EmployeeLeaveRequest.detail")
@ViewDescriptor("employee-leave-request-detail-view.xml")
@EditedEntityContainer("employeeLeaveRequestDc")
public class EmployeeLeaveRequestDetailView extends StandardDetailView<EmployeeLeaveRequest> {

    @Install(to = "employeeLeaveRequestDl", target = Target.DATA_LOADER)
    private EmployeeLeaveRequest customerDlLoadDelegate(final LoadContext<EmployeeLeaveRequest> loadContext) {
        Object id = loadContext.getId();
        // Here you can load the entity by id from an external storage.
        // Set the loaded entity to the not-new state using EntityStates.setNew(entity, false).
        return null;
    }

    @Install(target = Target.DATA_CONTEXT)
    private Set<Object> saveDelegate(final SaveContext saveContext) {
        EmployeeLeaveRequest entity = getEditedEntity();
        // Here you can save the entity to an external storage and return the saved instance.
        // Set the returned entity to the not-new state using EntityStates.setNew(entity, false).
        // If the new entity ID is assigned by the storage, set the ID to the original instance too 
        // to let the framework match the saved instance with the original one.
        EmployeeLeaveRequest saved = entity;
        return Set.of(saved);
    }
}
