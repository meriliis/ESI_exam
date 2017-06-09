package com.example.demo.inventory.application.dto;

import lombok.*;
import org.springframework.hateoas.ResourceSupport;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by Meri on 09-Jun-17.
 */
@Data
@Getter
@NoArgsConstructor(force = true)
@AllArgsConstructor(staticName = "of")
@EqualsAndHashCode
public class PropertyDTO extends ResourceSupport {
    String _id;
    BigDecimal price;
    String city;
    String streetAddress;
    int area;
    int floor;
    List<String> amenities;
    List<String> services;
}
