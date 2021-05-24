package com.company.stations3.screen.station;

import com.company.stations3.entity.DisabledType;
import com.vaadin.ui.CheckBoxGroup;
import io.jmix.ui.navigation.Route;
import io.jmix.ui.screen.*;
import com.company.stations3.entity.Station;

import javax.inject.Inject;

@Route(path="station-browse")
@UiController("Station.browse")
@UiDescriptor("station-browse.xml")
@LookupComponent("stationsTable")
public class StationBrowse extends StandardLookup<Station> {
}