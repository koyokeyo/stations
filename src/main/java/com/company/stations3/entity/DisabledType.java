package com.company.stations3.entity;

import io.jmix.core.metamodel.datatype.impl.EnumClass;

import javax.annotation.Nullable;

//перечисление с типами нарушений мобильности
public enum DisabledType implements EnumClass<String> {

    DISABLED("DISABLED I II GROUP"),
    OLD("OLD PERSON"),
    TEMPORARY("TEMPORARY DISABLED "),
    PREGNANT("PREGNANT WOMAN"),
    CHILD("DISABLED CHILD"),
    MUSCULOSKELETAL("MUSCULOSKELETAL IMPAIRMENT"),
    VISION("VISION IMPAIRMENT"),
    HEARING("HEARING IMPAIRMENT");

    private String id;

    DisabledType(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static DisabledType fromId(String id) {
        for (DisabledType at : DisabledType.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}