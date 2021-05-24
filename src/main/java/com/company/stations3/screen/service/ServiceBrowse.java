package com.company.stations3.screen.service;

import io.jmix.ui.screen.*;
import com.company.stations3.entity.Service;

@UiController("Service.browse")
@UiDescriptor("service-browse.xml")
@LookupComponent("servicesTable")
public class ServiceBrowse extends StandardLookup<Service> {
}