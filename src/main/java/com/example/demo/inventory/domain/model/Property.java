package com.example.demo.inventory.domain.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.List;

/**
 * Created by Meri on 09-Jun-17.
 */
@Entity
@Data
public class Property {
    @Id
    String id;

    BigDecimal price;
    String city;
    String streetAddress;
    int area;
    int floor;
    List<String> amenities;
    List<String> services;
}
