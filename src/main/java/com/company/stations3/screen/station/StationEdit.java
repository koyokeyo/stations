package com.company.stations3.screen.station;

import io.jmix.ui.screen.*;
import com.company.stations3.entity.Station;

@UiController("Station.edit")
@UiDescriptor("station-edit.xml")
@EditedEntityContainer("stationDc")
public class StationEdit extends StandardEditor<Station> {
}