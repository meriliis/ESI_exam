package com.example.demo.requests.application.dto;

import com.example.demo.common.application.dto.BusinessPeriodDTO;
import com.example.demo.common.domain.model.BusinessPeriod;
import com.example.demo.inventory.application.dto.PropertyDTO;
import com.example.demo.inventory.domain.model.Property;
import lombok.*;
import org.springframework.hateoas.ResourceSupport;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Data
@Getter
@NoArgsConstructor(force = true)
@AllArgsConstructor(staticName = "of")
@EqualsAndHashCode
public class PropertyReservationRequestDTO extends ResourceSupport {
    String _id;
    BusinessPeriodDTO reservationPeriodDTO;
    PropertyDTO propertyDTO;
}
