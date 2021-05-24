package com.company.stations3.screen.service;

import io.jmix.ui.screen.*;
import com.company.stations3.entity.Service;

@UiController("Service.edit")
@UiDescriptor("service-edit.xml")
@EditedEntityContainer("serviceDc")
public class ServiceEdit extends StandardEditor<Service> {
}