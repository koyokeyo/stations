package com.company.stations3.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.JmixEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.UUID;
//создание сущности станции
@JmixEntity
@Table(name = "STATION")
@Entity
public class Station {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

//добавление сервисов к станциям
    @JoinTable(name = "STATION_SERVICE_LINK",
            joinColumns = @JoinColumn(name = "STATION_ID"),
            inverseJoinColumns = @JoinColumn(name = "SERVICE_ID"))
    @ManyToMany
    private List<Service> service;

    @Column(name = "ARRIVAL_STATION", nullable = false)
    @NotNull
    private String arrival_station;

    @Column(name = "DEPARTURE_STATION", nullable = false)
    @NotNull
    private String departure_station;

    @Column(name = "QUALITY")
    private Integer quality;

    public List<Service> getService() {
        return service;
    }

    public void setService(List<Service> service) {
        this.service = service;
    }


    public Integer getQuality() {
        return quality;
    }

    public void setQuality(Integer quality) {
        this.quality = quality;
    }

    public String getDeparture_station() {
        return departure_station;
    }

    public void setDeparture_station(String departure_station) {
        this.departure_station = departure_station;
    }

    public String getArrival_station() {
        return arrival_station;
    }

    public void setArrival_station(String arrival_station) {
        this.arrival_station = arrival_station;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}