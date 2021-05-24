package com.company.stations3.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;
//сущность сервис(объект готовый для помещения в базу данных)
@JmixEntity
@Table(name = "SERVICE")
@Entity
public class Service {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @InstanceName
    @Column(name = "TITLE", nullable = false)
    private String title;
    //связь со станциями. В станциях можно будет выбирать список сервисов
    //Многие-ко-многим связь
    @JoinTable(name = "STATION_SERVICE_LINK",
            joinColumns = @JoinColumn(name = "SERVICE_ID"),
            inverseJoinColumns = @JoinColumn(name = "STATION_ID"))
    @ManyToMany
    private List<Station> stations;

    public List<Station> getStations() {
        return stations;
    }

    public void setStations(List<Station> stations) {
        this.stations = stations;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}