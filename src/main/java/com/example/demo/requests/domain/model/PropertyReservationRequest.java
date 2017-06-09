package com.example.demo.requests.domain.model;

import com.example.demo.common.domain.model.BusinessPeriod;
import com.example.demo.inventory.domain.model.Property;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@Getter
@NoArgsConstructor(force = true)
@AllArgsConstructor(staticName = "of")
public class PropertyReservationRequest {
    @Id
    String id;

    @Embedded
    BusinessPeriod reservationPeriod;

    @ManyToOne
    Property plant;

}
